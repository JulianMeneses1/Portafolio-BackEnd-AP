
package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.Usuario;
import com.julianmeneses.proyectoSpringBoot.Repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    public UsuarioRepository usuarioRepository;
    
    @Autowired
    public IEncryptService encryptService;

    @Override
    public List<Usuario> obtenerUsuarios() {
        
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario obtenerUsuario(Long id) {
        
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        
        String password = usuario.getContraseña();
        String hashPassword = encryptService.encryptPassword(password);
        usuario.setContraseña(hashPassword);
        usuarioRepository.save(usuario);
    }

    @Override
    public String verificarUsuario(Usuario usuario) {
        
        String nombreUsuario = usuario.getUsuario();
        String password = usuario.getContraseña();
        if (usuarioRepository.existsByUsuario(nombreUsuario)) {
            
            Usuario usuarioBD = usuarioRepository.findByUsuario(nombreUsuario);
            String hashPassword = usuarioBD.getContraseña();
            
            if (encryptService.verifyPassword(hashPassword, password)) {
                return "Login exitoso";
            } else {
                return "Contraseña incorrecta";
            }          
        } else {
            return "Usuario incorrecto";
        }
    }

}
