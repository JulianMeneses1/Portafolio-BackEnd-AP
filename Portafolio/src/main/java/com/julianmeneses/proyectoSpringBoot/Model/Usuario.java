
package com.julianmeneses.proyectoSpringBoot.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "usuarios_seq", sequenceName = "usuarios_seq", allocationSize = 1)
    private Long id;
    @Column(nullable = false, unique = true)
    private String usuario;
    private String contraseña; 
    
    @JsonIgnore
    @OneToOne (mappedBy = "usuario")
    private Persona persona;

    public Usuario(Long id, String usuario, String contraseña) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Usuario() {
    } 
    
}
