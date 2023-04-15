
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
@Table(name = "acerca_de_mi")
public class AcercaDeMi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "acerca_de_mi_seq", sequenceName = "acerca_de_mi_seq", allocationSize = 1)
    private Long id;
    private String titulo;
    private String descripcion;
    
    @JsonIgnore
    @OneToOne (mappedBy = "acerca_de_mi")
    private Persona persona;

    public AcercaDeMi(Long id, String titulo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
    
    public AcercaDeMi() {
    }
}
