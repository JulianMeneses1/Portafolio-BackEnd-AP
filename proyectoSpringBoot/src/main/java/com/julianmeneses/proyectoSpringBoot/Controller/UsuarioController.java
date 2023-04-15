
package com.julianmeneses.proyectoSpringBoot.Controller;

import com.julianmeneses.proyectoSpringBoot.DTO.UsuarioDTO;
import com.julianmeneses.proyectoSpringBoot.Model.Usuario;
import com.julianmeneses.proyectoSpringBoot.Service.IEncryptService;
import com.julianmeneses.proyectoSpringBoot.Service.IUsuarioService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    
    @Autowired
    public IUsuarioService usuarioService;
    
    @Autowired
    public IEncryptService encryptService;
    
    @GetMapping ("/usuarios/traer")
    public List <UsuarioDTO> obtenerUsuarios () {
        
        List <Usuario> listaUsuarios = usuarioService.obtenerUsuarios();
        List <UsuarioDTO> listaUsuariosDTO = new ArrayList <UsuarioDTO> ();
        for (Usuario usuario: listaUsuarios) {           
            listaUsuariosDTO.add (new UsuarioDTO (usuario.getId(), usuario.getUsuario(),usuario.getEstadoLogin()));            
        }
        
        return listaUsuariosDTO;
    }
    
    @GetMapping ("/usuario/traer/{id}")
    public UsuarioDTO obtenerBanner (@PathVariable Long id) {
        
        Usuario usuario = usuarioService.obtenerUsuario(id);
        
        UsuarioDTO usuarioDTO = new UsuarioDTO (usuario.getId(),usuario.getUsuario(),usuario.getEstadoLogin());
        
        return usuarioDTO;
        
    }   
    
    @PutMapping ("/usuario/editar/{id}")
    public Usuario editarAcercaDeMi (@PathVariable Long id, 
                                     @RequestBody Usuario usuario) {
        usuario.setId(id);
        usuarioService.crearUsuario(usuario); 
        
        return usuario;
    }
  
    
    @PostMapping ("/usuario/crear")
    public void crearAcercaDeMi (@RequestBody Usuario usuario) {
        
     usuarioService.crearUsuario(usuario); 

    }
    
    @PostMapping ("/login")
    public String verificarUsuario (@RequestBody Usuario usuario) {
        return usuarioService.verificarUsuario(usuario);
    }
}
