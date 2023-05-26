
package com.julianmeneses.proyectoSpringBoot.Controller;

import com.julianmeneses.proyectoSpringBoot.Model.FormacionAcademica;
import com.julianmeneses.proyectoSpringBoot.Service.IFormacionAcademicaService;
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
public class FormacionAcademicaController {
    
    @Autowired
    public IFormacionAcademicaService formacionService;
    
    @GetMapping ("/obtener/formaciones")
    public List <FormacionAcademica> obtenerFormaciones () {
        
        return formacionService.obtenerFormaciones();
    }
    
    @GetMapping ("/obtener/formacion/{id}")
    public FormacionAcademica obtenerFormacion (@PathVariable Long id) {
        
        return formacionService.obtenerFormacion(id);
        
    }   
    
    @PutMapping ("/editar/formacion/{id}")
    public void editarFormacion (@PathVariable Long id, 
                              @RequestBody FormacionAcademica formacion) {
        
        formacion.setId(id);
        formacionService.crearFormacion(formacion);
    
    }
  
    
    @PostMapping ("/crear/formacion")
    public void crearFormacion (@RequestBody FormacionAcademica formacion) {
        
     formacionService.crearFormacion(formacion);

    }    
    
    @DeleteMapping ("/eliminar/formacion/{id}")
    public void eliminarFormacion (@PathVariable Long id) {
        formacionService.borrarFormacion(id);
    }
   
}
