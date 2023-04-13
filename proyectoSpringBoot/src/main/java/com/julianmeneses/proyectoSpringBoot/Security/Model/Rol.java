
package com.julianmeneses.proyectoSpringBoot.Security.Model;

import com.julianmeneses.proyectoSpringBoot.Security.Enums.RolNombre;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name = "roles")
public class Rol {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private RolNombre nombre;
    
    
    @OneToOne (mappedBy = "rol")
    private Usuario usuario;

    public Rol() {
    }

    public Rol(Long id, RolNombre nombre, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
    }
    
}
