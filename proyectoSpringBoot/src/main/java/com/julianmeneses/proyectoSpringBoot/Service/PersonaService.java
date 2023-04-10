
package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.AcercaDeMi;
import com.julianmeneses.proyectoSpringBoot.Model.Banner;
import com.julianmeneses.proyectoSpringBoot.Model.Persona;
import com.julianmeneses.proyectoSpringBoot.Model.Usuario;
import com.julianmeneses.proyectoSpringBoot.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    public PersonaRepository persoRepository;

    @Override
    public List<Persona> obtenerPersonas() {
        return persoRepository.findAll();
    }

    @Override
    public Persona obtenerPersona(Long id) {
        return persoRepository.findById(id).orElse(null);
    }

    @Override
    public void editarPersona(Persona perso, String email, String telefono, String ubicacion) {
        
        perso.setEmail(email);
        perso.setTelefono(telefono);
        perso.setUbicacion(ubicacion);
        
        persoRepository.save(perso);
    }

}
