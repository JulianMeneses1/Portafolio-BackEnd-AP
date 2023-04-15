
package com.julianmeneses.proyectoSpringBoot.Controller;

import com.julianmeneses.proyectoSpringBoot.Model.TituloSeccion;
import com.julianmeneses.proyectoSpringBoot.Service.ITituloSeccionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TituloSeccionController {
    
    @Autowired
    public ITituloSeccionService tituloSeccionService;
    
    @GetMapping ("/titulosecciones/traer")
    public List <TituloSeccion> obtenerTitulos () {
        
        return tituloSeccionService.obtenerTitulos();
    }
    
    @GetMapping ("/tituloseccion/traer/{id}")
    public TituloSeccion obtenerTitulo (@PathVariable Long id) {
        
        return tituloSeccionService.obtenerTitulo(id);
        
    }   
    
    @PutMapping ("/tituloseccion/editar/{id}")
    public void editarTitulo (@PathVariable Long id, 
                              @RequestBody TituloSeccion titulo) {
        titulo.setId(id);
        tituloSeccionService.crearTitulo(titulo);
      
    }
  
    
    @PostMapping ("/tituloseccion/crear")
    public void crearTitulo (@RequestBody TituloSeccion titulo) {
        
     tituloSeccionService.crearTitulo(titulo);

    }    
   
}
