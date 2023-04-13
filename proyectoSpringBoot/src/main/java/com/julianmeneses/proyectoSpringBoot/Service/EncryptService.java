
package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class EncryptService implements IEncryptService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public String encryptPassword(String password) {
        
        // encriptamos la contraseña original
        String hashPassword = BCrypt.hashpw(password, BCrypt.gensalt());        
        return hashPassword;
    }

    @Override
    public boolean verifyPassword(String originalPassword, String hashPassword) {
        return false;
    }

}
