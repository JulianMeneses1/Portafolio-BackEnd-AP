

package com.julianmeneses.proyectoSpringBoot.Repository;

import com.julianmeneses.proyectoSpringBoot.Model.AcercaDeMi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeMiRepository extends JpaRepository <AcercaDeMi, Long> {

}
