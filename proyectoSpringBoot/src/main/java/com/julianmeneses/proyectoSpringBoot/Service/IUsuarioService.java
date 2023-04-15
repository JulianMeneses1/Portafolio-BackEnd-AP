

package com.julianmeneses.proyectoSpringBoot.Service;


public interface IEncryptService {
    
    // este método recibe la contraseña que el usuario ingresa, y va a devolver la contraseña encriptada
    String encryptPassword (String password);
    
    // este método valida que la contraseña ingresada (sin codificar) sea igual a la encriptada (hash)
    boolean verifyPassword (String originalPassword, String hashPassword);
    
}
