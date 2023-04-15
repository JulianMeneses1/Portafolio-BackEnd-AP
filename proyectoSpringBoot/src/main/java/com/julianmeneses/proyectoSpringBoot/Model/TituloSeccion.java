
package com.julianmeneses.proyectoSpringBoot.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "titulo_secciones")
public class TituloSeccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo; 
    
    @JsonIgnore    
    @OneToMany (mappedBy = "titulo_seccion")
    private List <Proyecto> proyectos;
    
    @JsonIgnore   
    @OneToMany (mappedBy = "titulo_seccion")
    private List <Conocimiento> conocimientos;
    
    @JsonIgnore   
    @OneToMany (mappedBy = "titulo_seccion")
    private List <ExperienciaLaboral> experiencias;
    
    @JsonIgnore   
    @OneToMany (mappedBy = "titulo_seccion")
    private List <FormacionAcademica> formaciones;

    public TituloSeccion(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;     
    }

    public TituloSeccion() {
    }
    
    

  
    
    

}
