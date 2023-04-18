

package com.julianmeneses.proyectoSpringBoot.Repository;

import com.julianmeneses.proyectoSpringBoot.Model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    
    public boolean existsByUsuario (String nombreUsuario);
    
    public Optional <Usuario> findByUsuario (String nombreUsuario);

}
