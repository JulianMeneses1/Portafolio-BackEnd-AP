
package com.julianmeneses.proyectoSpringBoot.Controller;

import com.julianmeneses.proyectoSpringBoot.Model.ExperienciaLaboral;
import com.julianmeneses.proyectoSpringBoot.Service.IExperienciaLaboralService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaLaboralController {
    
    @Autowired
    public IExperienciaLaboralService experienciaService;
    
    @GetMapping ("/experiencias/traer")
    public List <ExperienciaLaboral> obtenerExperiencias () {
        
        return experienciaService.obtenerExperiencias();
    }
    
    @GetMapping ("/experiencia/traer/{id}")
    public ExperienciaLaboral obtenerExperiencia (@PathVariable Long id) {
        
        return experienciaService.obtenerExperiencia(id);
        
    }   
    
    @PutMapping ("/experiencia/editar/{id}")
    public void editarExperiencia (@PathVariable Long id, 
                              @RequestBody ExperienciaLaboral exp) {
        
        exp.setId(id);
        experienciaService.crearExperiencia(exp);
      
    }
  
    
    @PostMapping ("/experiencia/crear")
    public void crearExperiencia (@RequestBody ExperienciaLaboral exp) {
        
     experienciaService.crearExperiencia(exp);

    }    
    
    @DeleteMapping ("/experiencia/eliminar/{id}")
    public void eliminarExperiencia (@PathVariable Long id) {
        experienciaService.borrarExperiencia(id);
    }
   
}
