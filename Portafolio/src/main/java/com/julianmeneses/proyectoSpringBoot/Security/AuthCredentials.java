
package com.julianmeneses.proyectoSpringBoot.Security;

import lombok.Data;

// CLASE QUE DEFINE LAS CREDENCIALES PARA OBTENER EL TOKEN (USUARIO Y CONTRASEÑA)

@Data
public class AuthCredentials {
    private String usuario;
    private String contraseña;
}
