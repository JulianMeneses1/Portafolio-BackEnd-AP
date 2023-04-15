
package com.julianmeneses.proyectoSpringBoot.Service;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class EncryptService implements IEncryptService {
    
    @Override
    public String encryptPassword(String password) {
        
        // encriptamos la contraseña original
        String hashPassword = BCrypt.hashpw(password, BCrypt.gensalt());        
        return hashPassword;
    }  
    
    @Override 
    public boolean verifyPassword (String hashPassword, String passwordEntered) {
        return BCrypt.checkpw(passwordEntered, hashPassword);
    }

}
