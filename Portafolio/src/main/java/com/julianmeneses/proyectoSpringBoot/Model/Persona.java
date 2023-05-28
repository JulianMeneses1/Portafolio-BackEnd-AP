
package com.julianmeneses.proyectoSpringBoot.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "personas")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String ubicacion;    
    
    @OneToOne 
    @JoinColumn (name = "usuario_id")
    private Usuario usuario;
    
    @OneToOne 
    @JoinColumn (name = "banner_id")
    private Banner banner;    
    
    @OneToOne 
    @JoinColumn (name = "acerca_de_mi_id")
    private AcercaDeMi acerca_de_mi;
    
    @JsonIgnore
    @OneToMany (mappedBy = "persona")
    List <Conocimiento> conocimientos;
    
    @JsonIgnore
    @OneToMany (mappedBy = "persona")
    List <Proyecto> proyectos;
    
    @JsonIgnore
    @OneToMany (mappedBy = "persona")
    List <FormacionAcademica> formaciones;
     
    @JsonIgnore
    @OneToMany (mappedBy = "persona")
    List <ExperienciaLaboral> experiencias;
    

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
