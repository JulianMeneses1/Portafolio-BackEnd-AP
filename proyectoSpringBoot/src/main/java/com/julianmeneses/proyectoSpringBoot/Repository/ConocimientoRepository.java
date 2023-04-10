

package com.julianmeneses.proyectoSpringBoot.Repository;

import com.julianmeneses.proyectoSpringBoot.Model.Conocimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConocimientoRepository extends JpaRepository <Conocimiento, Long> {

}
