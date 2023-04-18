
package com.julianmeneses.proyectoSpringBoot.Security;

import com.julianmeneses.proyectoSpringBoot.Model.Usuario;
import com.julianmeneses.proyectoSpringBoot.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

// CLASE PARA AUTENTICAR EL USUARIO INGRESADO REVISANDO EN LA TABLA USUARIOS DE LA BBDD 

@Service
public class UserDetailServiceImpl implements UserDetailsService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         Usuario usuario = usuarioRepository.findByUsuario(username)
                .orElseThrow(() -> new UsernameNotFoundException ("El usuario " + username + " no existe."));
        
        return new UserDetailsImpl(usuario);
    }

}
