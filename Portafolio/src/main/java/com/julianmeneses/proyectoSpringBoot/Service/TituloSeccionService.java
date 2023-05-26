
package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.TituloSeccion;
import com.julianmeneses.proyectoSpringBoot.Repository.TituloSeccionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TituloSeccionService implements ITituloSeccionService {
    
    @Autowired
    public TituloSeccionRepository tituloRepository;   

    @Override
    public List<TituloSeccion> obtenerTitulos() {
      return tituloRepository.findAll();
    }

    @Override
    public TituloSeccion obtenerTitulo(Long id) {
        return tituloRepository.findById(id).orElse(null);
    }

    @Override
    public void crearTitulo(TituloSeccion titulo) { 
        
        
        tituloRepository.save(titulo);    
    }

}
