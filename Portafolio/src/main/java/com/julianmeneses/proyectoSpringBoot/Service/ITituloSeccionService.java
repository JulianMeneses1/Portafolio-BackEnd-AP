

package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.TituloSeccion;
import java.util.List;


public interface ITituloSeccionService {
    
    public List<TituloSeccion> obtenerTitulos ();
    
    public TituloSeccion obtenerTitulo(Long id);  
    
    public void crearTitulo (TituloSeccion titulo);
    
}
