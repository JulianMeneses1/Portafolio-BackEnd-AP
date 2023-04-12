
package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.FormacionAcademica;
import com.julianmeneses.proyectoSpringBoot.Repository.FormacionAcademicaRepository;
import java.util.Date;
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
    public void editarFormacion (FormacionAcademica formacion, String nombre, String descripcion, Date fecha_inicio,
                                 Date fecha_fin)
     {
        
        formacion.setNombre(nombre);
        formacion.setDescripcion(descripcion);
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
