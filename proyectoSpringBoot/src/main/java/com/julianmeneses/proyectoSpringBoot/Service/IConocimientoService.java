

package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.Conocimiento;
import java.util.List;


public interface IConocimientoService {
    public List<Conocimiento> obtenerConocimientos ();
    
    public Conocimiento obtenerConocimiento(Long id);  
    
    public void editarConocimiento (Conocimiento conoc,String icono, String  nombre, String nivel);
    
    public void borrarConocimiento (Long id);
    
    public void crearConocimiento (Conocimiento conoc);

    
}
