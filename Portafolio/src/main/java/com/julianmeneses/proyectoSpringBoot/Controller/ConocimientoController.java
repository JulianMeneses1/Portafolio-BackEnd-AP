
package com.julianmeneses.proyectoSpringBoot.Controller;

import com.julianmeneses.proyectoSpringBoot.Model.Conocimiento;
import com.julianmeneses.proyectoSpringBoot.Service.IConocimientoService;
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
public class ConocimientoController {
    
    @Autowired
    public IConocimientoService conocimientoService;
    
    @GetMapping ("/obtener/conocimientos")
    public List <Conocimiento> obtenerConocimientos () {
        
        return conocimientoService.obtenerConocimientos();
    }
    
    @GetMapping ("/obtener/conocimiento/{id}")
    public Conocimiento obtenerConocimiento (@PathVariable Long id) {
        
        return conocimientoService.obtenerConocimiento(id);
        
    }   
    
    @PutMapping ("/editar/conocimiento/{id}")
    public void editarConocimiento (@PathVariable Long id, 
                              @RequestBody Conocimiento conocimiento) {
        
        conocimiento.setId(id);
        conocimientoService.crearConocimiento(conocimiento);
      
    }
  
    
    @PostMapping ("/crear/conocimiento")
    public void crearConocimiento (@RequestBody Conocimiento conocimiento) {
        
     conocimientoService.crearConocimiento(conocimiento);

    }    
    
    @DeleteMapping ("/eliminar/conocimiento/{id}")
    public void eliminarConocimiento (@PathVariable Long id) {
        conocimientoService.borrarConocimiento(id);
    }
   
}
