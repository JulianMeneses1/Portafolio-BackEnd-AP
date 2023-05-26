
package com.julianmeneses.proyectoSpringBoot.Model;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Email {
    
    private String asunto;
    private String mensaje;

    public Email(String asunto, String mensaje) {        
        this.asunto = asunto;
        this.mensaje = mensaje;
    }
    
    

}
