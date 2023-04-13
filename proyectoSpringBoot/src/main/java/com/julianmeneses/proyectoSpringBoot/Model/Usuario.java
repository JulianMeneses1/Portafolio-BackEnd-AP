
package com.julianmeneses.proyectoSpringBoot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String usuario;
    private String contraseña;
    private boolean estado_login;    
    
    @OneToOne (mappedBy = "usuario")
    private Persona persona;

    public Usuario(Long id, String usuario, String contraseña, boolean estado_login) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estado_login = estado_login;
    }

    public Usuario() {
    }
    
}
