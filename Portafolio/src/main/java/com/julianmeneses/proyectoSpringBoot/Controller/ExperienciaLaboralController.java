
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
    
    @GetMapping ("/obtener/experiencias")
    public List <ExperienciaLaboral> obtenerExperiencias () {
        
        return experienciaService.obtenerExperiencias();
    }
    
    @GetMapping ("/obtener/experiencia/{id}")
    public ExperienciaLaboral obtenerExperiencia (@PathVariable Long id) {
        
        return experienciaService.obtenerExperiencia(id);
        
    }   
    
    @PutMapping ("/editar/experiencia/{id}")
    public void editarExperiencia (@PathVariable Long id, 
                              @RequestBody ExperienciaLaboral exp) {
        
        exp.setId(id);
        experienciaService.crearExperiencia(exp);
      
    }
  
    
    @PostMapping ("/crear/experiencia")
    public void crearExperiencia (@RequestBody ExperienciaLaboral exp) {
        
     experienciaService.crearExperiencia(exp);

    }    
    
    @DeleteMapping ("/eliminar/experiencia/{id}")
    public void eliminarExperiencia (@PathVariable Long id) {
        experienciaService.borrarExperiencia(id);
    }
   
}
