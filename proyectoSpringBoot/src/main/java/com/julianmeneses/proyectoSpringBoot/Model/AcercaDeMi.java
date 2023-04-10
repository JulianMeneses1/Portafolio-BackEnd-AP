
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
@Table(name = "acerca_de_mi")
public class AcercaDeMi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String descripcion;
    
    @OneToOne (mappedBy = "acerca_de_mi")
    private Persona persona;

    public AcercaDeMi(Long id, String titulo, String descripcion, Persona persona) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.persona = persona;
    }
    
    public AcercaDeMi() {
    }
    
    

  
    
    

}
