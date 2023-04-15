
package com.julianmeneses.proyectoSpringBoot.DTO;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UsuarioDTO implements Serializable {
    
    private Long id;
    private String nombre;
    private boolean estado_login;

    public UsuarioDTO(Long id, String nombre, boolean estado_login) {
        this.id = id;
        this.nombre = nombre;
        this.estado_login = estado_login;        
    }

    public UsuarioDTO() {
    }
}


