
package com.julianmeneses.proyectoSpringBoot.DTO;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UsuarioDTO implements Serializable {
    
    private Long id;
    private String nombre;


    public UsuarioDTO(Long id, String nombre) {
        this.id = id;
    
    }

    public UsuarioDTO() {
    }
}


