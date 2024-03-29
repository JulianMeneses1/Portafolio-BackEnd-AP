
package com.julianmeneses.proyectoSpringBoot.Controller;

import com.julianmeneses.proyectoSpringBoot.Model.Persona;
import com.julianmeneses.proyectoSpringBoot.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    public IPersonaService personaService;
    
    @GetMapping ("/obtener/personas")
    public List <Persona> obtenerPersonas () {        
        
        return personaService.obtenerPersonas();
    }
    
    @GetMapping ("/obtener/persona/{id}")
    public Persona obtenerPersona (@PathVariable Long id) {
        
        return personaService.obtenerPersona(id);
        
    }
    
    @PutMapping ("/editar/persona/{id}")
    public void editarPersona (@PathVariable Long id, 
                               @RequestBody Persona persona) {
        
        //le asigno a persona el id del registro a modificar
        persona.setId(id);
        
        //la edito        
        personaService.crearPersona(persona);         
        
    }
    
    @PostMapping ("/crear/persona")
    public void crearPersona (@RequestBody Persona persona) {
        personaService.crearPersona(persona);
    }
}
