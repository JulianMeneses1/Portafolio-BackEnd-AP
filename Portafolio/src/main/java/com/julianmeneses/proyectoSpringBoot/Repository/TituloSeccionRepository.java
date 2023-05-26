

package com.julianmeneses.proyectoSpringBoot.Repository;

import com.julianmeneses.proyectoSpringBoot.Model.TituloSeccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TituloSeccionRepository extends JpaRepository <TituloSeccion, Long> {

}
