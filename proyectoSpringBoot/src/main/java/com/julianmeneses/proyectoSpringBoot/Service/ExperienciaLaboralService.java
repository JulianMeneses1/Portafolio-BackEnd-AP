
package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.ExperienciaLaboral;
import com.julianmeneses.proyectoSpringBoot.Repository.ExperienciaLaboralRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService {
    
    @Autowired
    public ExperienciaLaboralRepository expRepository;

    @Override
    public List<ExperienciaLaboral> obtenerExperiencias() {
        return expRepository.findAll();
    }

    @Override
    public ExperienciaLaboral obtenerExperiencia(Long id) {
           return expRepository.findById(id).orElse(null);
    }

    @Override
    public void editarExperiencia(ExperienciaLaboral exp, String nombre_empresa, String descripcion, Date fecha_inicio, Date fecha_fin, String puesto, 
        String url, String posicion_Y) {
        
        exp.setNombre_empresa(nombre_empresa);
        exp.setDescripcion(descripcion);
        exp.setFecha_inicio(fecha_inicio);
        exp.setFecha_fin(fecha_fin);
        exp.setPuesto(puesto);
        exp.setUrl(url);
        exp.setPosicion_Y(posicion_Y);
        
        expRepository.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepository.deleteById(id);
    }

    @Override
    public void crearExperiencia(ExperienciaLaboral exp) {
        expRepository.save(exp);
    }

}
