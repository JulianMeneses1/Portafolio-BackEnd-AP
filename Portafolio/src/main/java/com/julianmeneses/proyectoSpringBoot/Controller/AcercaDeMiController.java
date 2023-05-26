
package com.julianmeneses.proyectoSpringBoot.Controller;

import com.julianmeneses.proyectoSpringBoot.Model.AcercaDeMi;
import com.julianmeneses.proyectoSpringBoot.Service.IAcercaDeMiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcercaDeMiController {
    
    @Autowired
    public IAcercaDeMiService acercaService;
    
    
    @GetMapping ("/obtener/acercademi")
    public List <AcercaDeMi> obtenerAcercaDeMi () {
        
        return acercaService.obtenerAcercaDeMi();
    } 
    
    @GetMapping ("/obtener/acercademi/{id}")
    public AcercaDeMi obtenerAcercaDeMi (@PathVariable Long id) {
        
        return acercaService.obtenerAcerca(id);
    }
    
    @PutMapping ("/editar/acercademi/{id}")
    public AcercaDeMi editarAcercaDeMi (@PathVariable Long id, 
                                        @RequestBody AcercaDeMi acerca) {
        
        //le asigno a persona el id del registro a modificar
        acerca.setId(id);
        
        //la edito        
        acercaService.crearAcercaDeMi(acerca); 
        
        return acerca;
    }
    
    @PostMapping ("/crear/acercademi")
    public void crearAcercaDeMi (@RequestBody AcercaDeMi acerca) {
        
     acercaService.crearAcercaDeMi(acerca); 

    }
}
