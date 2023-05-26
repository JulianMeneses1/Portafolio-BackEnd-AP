

package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.FormacionAcademica;
import java.util.List;


public interface IFormacionAcademicaService {
    public List<FormacionAcademica> obtenerFormaciones ();
    
    public FormacionAcademica obtenerFormacion (Long id);  
    
    public void editarFormacion (FormacionAcademica formacion, String nombre, String descripcion, String fecha_inicio,
                                 String fecha_fin, String imagen, String institucion, String url_certificado, String url_institucion);
    
    public void borrarFormacion (Long id);
    
    public void crearFormacion (FormacionAcademica formacion);

}
