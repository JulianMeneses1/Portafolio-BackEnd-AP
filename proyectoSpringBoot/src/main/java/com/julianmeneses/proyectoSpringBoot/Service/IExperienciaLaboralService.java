

package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.ExperienciaLaboral;
import java.util.Date;
import java.util.List;


public interface IExperienciaLaboralService {
    public List<ExperienciaLaboral> obtenerExperiencias();
    
    public ExperienciaLaboral obtenerExperiencia(Long id);  
    
    public void editarExperiencia (ExperienciaLaboral exp,String nombre_empresa, String descripcion, Date fecha_inicio, 
                                    Date fecha_fin, String puesto, String url, String posicion_Y); 

    
    public void borrarExperiencia (Long id);
    
    public void crearExperiencia(ExperienciaLaboral exp);

    
}
