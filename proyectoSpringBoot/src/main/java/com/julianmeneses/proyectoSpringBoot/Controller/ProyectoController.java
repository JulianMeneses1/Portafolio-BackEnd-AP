
package com.julianmeneses.proyectoSpringBoot.Controller;

import com.julianmeneses.proyectoSpringBoot.Model.Conocimiento;
import com.julianmeneses.proyectoSpringBoot.Model.Proyecto;
import com.julianmeneses.proyectoSpringBoot.Service.IConocimientoService;
import com.julianmeneses.proyectoSpringBoot.Service.IProyectoService;
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
public class ProyectoController {
    
    @Autowired
    public IProyectoService proyectoService;
    
    @GetMapping ("/proyectos/traer")
    public List <Proyecto> obtenerProyectos () {
        
        return proyectoService.obtenerProyectos();
    }
    
    @GetMapping ("/proyecto/traer/{id}")
    public Proyecto obtenerProyecto (@PathVariable Long id) {
        
        return proyectoService.obtenerProyecto(id);
        
    }   
    
    @PutMapping ("/proyecto/editar/{id}")
    public void editarProyecto (@PathVariable Long id, 
                                    @RequestBody Proyecto proyecto) {
        
        proyecto.setId(id);
        proyectoService.crearProyecto(proyecto);
      
    }
  
    
    @PostMapping ("/proyecto/crear")
    public void crearProyecto (@RequestBody Proyecto proyecto) {
        
     proyectoService.crearProyecto(proyecto);

    }    
    
    @DeleteMapping ("/proyecto/eliminar/{id}")
    public void eliminarProyecto (@PathVariable Long id) {
        proyectoService.borrarProyecto(id);
    }
   
}
