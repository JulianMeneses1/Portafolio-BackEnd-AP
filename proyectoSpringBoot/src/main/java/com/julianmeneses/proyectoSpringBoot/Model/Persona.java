
package com.julianmeneses.proyectoSpringBoot.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "personas")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String ubicacion;
    
    @JsonBackReference
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "usuario_id")
    private Usuario usuario;
    
    @JsonBackReference
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "banner_id")
    private Banner banner;
    
    @JsonBackReference
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "acerca_de_mi_id")
    private AcercaDeMi acerca_de_mi;

    public Persona(Long id, String nombre, String apellido, String email, String telefono, String ubicacion, Usuario usuario, Banner banner, AcercaDeMi acerca_de_mi) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.usuario = usuario;
        this.banner = banner;
        this.acerca_de_mi = acerca_de_mi;
    }

    

    public Persona() {
    }
    
    

  
    
    

}
