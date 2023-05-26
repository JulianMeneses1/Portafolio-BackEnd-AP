

package com.julianmeneses.proyectoSpringBoot.Repository;

import com.julianmeneses.proyectoSpringBoot.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {

}
