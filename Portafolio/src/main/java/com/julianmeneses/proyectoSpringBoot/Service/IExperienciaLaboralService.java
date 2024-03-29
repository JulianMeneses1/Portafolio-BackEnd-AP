

package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.ExperienciaLaboral;
import java.util.List;


public interface IExperienciaLaboralService {
    public List<ExperienciaLaboral> obtenerExperiencias();
    
    public ExperienciaLaboral obtenerExperiencia(Long id);  
    
    public void editarExperiencia (ExperienciaLaboral exp,String nombre_empresa, String descripcion, String fecha_inicio, 
                                    String fecha_fin, String puesto, String url, String posicion_Y); 

    
    public void borrarExperiencia (Long id);
    
    public void crearExperiencia(ExperienciaLaboral exp);

    
}
