

package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.FormacionAcademica;
import java.util.Date;
import java.util.List;


public interface IFormacionAcademicaService {
    public List<FormacionAcademica> obtenerFormaciones ();
    
    public FormacionAcademica obtenerFormacion (Long id);  
    
    public void editarFormacion (FormacionAcademica formacion, String nombre, String descripcion, Date fecha_inicio,
                                 Date fecha_fin);
    
    public void borrarFormacion (Long id);
    
    public void crearFormacion (FormacionAcademica formacion);

}
