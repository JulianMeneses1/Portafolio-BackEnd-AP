
package com.julianmeneses.proyectoSpringBoot.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String usuario;
    private String contraseña;
    private boolean estado_login;    
    
    @JsonIgnore
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
    
    public boolean getEstadoLogin () {
        return this.estado_login;
    }
    
    public void setEstadoLogin (boolean estado) {
        this.estado_login=estado;
    }
    
}
