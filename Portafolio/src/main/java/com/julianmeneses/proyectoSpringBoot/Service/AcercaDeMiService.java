
package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.AcercaDeMi;
import com.julianmeneses.proyectoSpringBoot.Repository.AcercaDeMiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeMiService implements IAcercaDeMiService {
    
    @Autowired
    public AcercaDeMiRepository acercaRepository;   

    @Override
    public List<AcercaDeMi> obtenerAcercaDeMi() {
        return acercaRepository.findAll();
    }

    @Override
    public AcercaDeMi obtenerAcerca(Long id) {
        return acercaRepository.findById(id).orElse(null);
    }

    @Override
    public void crearAcercaDeMi(AcercaDeMi acerca) {    
        
        acercaRepository.save(acerca);
    }

}
