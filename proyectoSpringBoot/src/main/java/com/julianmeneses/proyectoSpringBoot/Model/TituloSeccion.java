
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
@Table(name = "titulo_secciones")
public class TituloSeccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;   
    
    @OneToOne (mappedBy = "titulo_seccion")
    private Proyecto proyecto;
    
    @OneToOne (mappedBy = "titulo_seccion")
    private Conocimiento conocimiento;
    
    @OneToOne (mappedBy = "titulo_seccion")
    private ExperienciaLaboral experiencia_laboral;
    
    @OneToOne (mappedBy = "titulo_seccion")
    private FormacionAcademica formacion_academica;

    public TituloSeccion(Long id, String titulo, Proyecto proyecto, Conocimiento conocimiento, ExperienciaLaboral experiencia_laboral, FormacionAcademica formacion_academica) {
        this.id = id;
        this.titulo = titulo;
        this.proyecto = proyecto;
        this.conocimiento = conocimiento;
        this.experiencia_laboral = experiencia_laboral;
        this.formacion_academica = formacion_academica;
    }

    public TituloSeccion() {
    }
    
    

  
    
    

}
