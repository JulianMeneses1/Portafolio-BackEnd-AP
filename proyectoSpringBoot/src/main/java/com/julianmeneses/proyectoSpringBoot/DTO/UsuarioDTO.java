
package com.julianmeneses.proyectoSpringBoot.DTO;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UsuarioDTO implements Serializable {
    
    private Long id;
    private String usuario;


    public UsuarioDTO(Long id, String usuario) {
        this.id = id;
        this.usuario = usuario;
    
    }

    public UsuarioDTO() {
    }
}


