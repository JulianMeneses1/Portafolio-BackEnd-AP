
package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.Usuario;
import com.julianmeneses.proyectoSpringBoot.Repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {
    
    @Autowired
    public UsuarioRepository usuarioRepository;
  
    @Override
    public List<Usuario> obtenerUsuarios() {
        return  usuarioRepository.findAll();
    }

    @Override
    public Usuario obtenerUsuario(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public void editarUsuario(Usuario usuario, boolean estado_login) {
        
        usuario.setEstado_login(estado_login);
        
        usuarioRepository.save(usuario);
        
    }

}
