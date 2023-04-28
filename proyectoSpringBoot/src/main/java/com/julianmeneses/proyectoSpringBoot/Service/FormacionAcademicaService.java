
package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.FormacionAcademica;
import com.julianmeneses.proyectoSpringBoot.Repository.FormacionAcademicaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormacionAcademicaService implements IFormacionAcademicaService {
    
    @Autowired
    public FormacionAcademicaRepository formaRepository;

    @Override
    public List<FormacionAcademica> obtenerFormaciones() {
        return formaRepository.findAll();
    }

    @Override
    public FormacionAcademica obtenerFormacion(Long id) {
        return formaRepository.findById(id).orElse(null);
    }

    @Override
    public void editarFormacion (FormacionAcademica formacion, String nombre, String descripcion, String fecha_inicio,
                                 String fecha_fin, String imagen, String institucion, String url_certificado, String url_institucion)
     {
        
        formacion.setNombre(nombre);
        formacion.setImagen(imagen);
        formacion.setInstitucion(institucion);
        formacion.setUrl_certificado(url_certificado);
        formacion.setUrl_institucion(url_institucion);
        formacion.setDescripcion(descripcion);
        formacion.setFecha_inicio(fecha_inicio);
        formacion.setFecha_fin(fecha_fin);
        
        formaRepository.save(formacion);
    }
  
    @Override
    public void borrarFormacion(Long id) {
        formaRepository.deleteById(id);
    }

    @Override
    public void crearFormacion(FormacionAcademica formacion) {
        formaRepository.save(formacion);
    }

}
