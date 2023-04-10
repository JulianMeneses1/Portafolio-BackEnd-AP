
package com.julianmeneses.proyectoSpringBoot.Controller;

import com.julianmeneses.proyectoSpringBoot.Model.Persona;
import com.julianmeneses.proyectoSpringBoot.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    public IPersonaService personaService;
    
    @GetMapping ("/traer/personas")
    public List <Persona> obtenerPersonas () {
        return personaService.obtenerPersonas();
    }
    
    @GetMapping ("/traer/persona/{id}")
    public Persona obtenerPersona (@PathVariable Long id) {
        return personaService.obtenerPersona(id);
    }
    
    @PutMapping ("/editar/persona/{id}")
    public String editarPersona (@PathVariable Long id, 
                               @RequestParam ("email") String nuevoEmail,
                               @RequestParam ("telefono") String nuevoTelefono,
                               @RequestParam ("ubicacion") String nuevaUbicacion) {
        
        //busco la persona
        Persona perso = personaService.obtenerPersona(id);
        
        //la edito        
        personaService.editarPersona(perso,nuevoEmail,nuevoTelefono,nuevaUbicacion); 
        
        return "La persona de id " + id + " se ha modificado correctamente: " + perso.getEmail() + " " 
                + perso.getTelefono() + " " + perso.getUbicacion();
    }
}
