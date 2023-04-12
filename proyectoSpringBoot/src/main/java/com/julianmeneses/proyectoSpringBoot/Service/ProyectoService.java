
package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.Persona;
import com.julianmeneses.proyectoSpringBoot.Model.Proyecto;
import com.julianmeneses.proyectoSpringBoot.Repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public ProyectoRepository proyectoRepository; 


    @Override
    public List<Proyecto> obtenerProyectos() {
        return proyectoRepository.findAll();
    }

    @Override
    public Proyecto obtenerProyecto(Long id) {
       return proyectoRepository.findById(id).orElse(null);
    }

    @Override
    public void editarProyecto(Proyecto proyecto, String imagen, String nombre, String descripcion, String url_github, 
            String url_sitio_web, String tecnologias) {
        
        proyecto.setImagen(imagen);
        proyecto.setNombre(nombre);
        proyecto.setDescripcion(descripcion);
        proyecto.setUrl_github(url_github);
        proyecto.setUrl_sitio_web(url_sitio_web);
        proyecto.setTecnologias(tecnologias);
        
        proyectoRepository.save(proyecto);        
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectoRepository.deleteById(id);
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

}
