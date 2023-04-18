
package com.julianmeneses.proyectoSpringBoot.Service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EncryptService implements IEncryptService {
    
    @Override
    public String encryptPassword(String password) {
        
        // encriptamos la contraseña original            
        return new BCryptPasswordEncoder().encode(password);
    }  
}

