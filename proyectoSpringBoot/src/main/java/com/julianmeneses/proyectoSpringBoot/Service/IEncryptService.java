

package com.julianmeneses.proyectoSpringBoot.Service;


public interface IEncryptService {
    
    // este método recibe la contraseña que el usuario ingresa, y va a devolver la contraseña encriptada
    public String encryptPassword (String password);

    public boolean verifyPassword (String hashPassword, String passwordEntered);    
}


