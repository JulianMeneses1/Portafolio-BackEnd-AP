

package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.AcercaDeMi;
import java.util.List;


public interface IAcercaDeMiService {
    
    public List<AcercaDeMi> obtenerAcercaDeMi ();
    
    public AcercaDeMi obtenerAcerca(Long id);  
    
    public void crearAcercaDeMi (AcercaDeMi acerca);

    
}
