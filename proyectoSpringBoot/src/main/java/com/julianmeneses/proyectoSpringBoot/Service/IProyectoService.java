

package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.Proyecto;
import java.util.List;


public interface IProyectoService {
    public List<Proyecto> obtenerProyectos ();
    
    public Proyecto obtenerProyecto(Long id);  
    
    public void editarProyecto(Proyecto proyecto, String imagen, String nombre, String descripcion, String url_github, 
                                String url_sitio_web, String tecnologias);
    
    public void borrarProyecto (Long id);
    
    public void crearProyecto (Proyecto proyecto);

    
}
