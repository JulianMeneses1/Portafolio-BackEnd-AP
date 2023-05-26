

package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    public List<Usuario> obtenerUsuarios();
    
    public Usuario obtenerUsuario(Long id);   
    
    public void crearUsuario(Usuario usuario);
     
}
