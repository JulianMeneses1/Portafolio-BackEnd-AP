
package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.Conocimiento;
import com.julianmeneses.proyectoSpringBoot.Repository.ConocimientoRepository;
import com.julianmeneses.proyectoSpringBoot.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConocimientoService implements IConocimientoService {
    
    @Autowired
    public ConocimientoRepository conocRepository;

    @Override
    public List<Conocimiento> obtenerConocimientos() {
        return conocRepository.findAll();
    }

    @Override
    public Conocimiento obtenerConocimiento(Long id) {
        return conocRepository.findById(id).orElse(null);
    }

    @Override
    public void editarConocimiento(Conocimiento conoc, String imagen, String nombre, String nivel) {
        conoc.setImagen(imagen);
        conoc.setNombre(nombre);
        conoc.setNivel(nivel);
        
        conocRepository.save(conoc);
    }

    @Override
    public void borrarConocimiento(Long id) {
        conocRepository.deleteById(id);
    }

    @Override
    public void crearConocimiento(Conocimiento conoc) {
        conocRepository.save(conoc);
    }

    

}
