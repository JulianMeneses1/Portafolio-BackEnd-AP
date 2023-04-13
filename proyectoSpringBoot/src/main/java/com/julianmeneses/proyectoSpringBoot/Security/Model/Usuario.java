
package com.julianmeneses.proyectoSpringBoot.Security.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.julianmeneses.proyectoSpringBoot.Model.Persona;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String usuario;
    private String contraseña;
    
    @JsonBackReference
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "rol_id")
    private Rol rol;
    
    @OneToOne (mappedBy = "usuario")
    private Persona persona;

    public Usuario() {
    }

    public Usuario(Long id, String usuario, String contraseña, Rol rol, Persona persona) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
        this.persona = persona;
    }
    
}
