
package com.julianmeneses.proyectoSpringBoot.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "formaciones_academicas")
public class FormacionAcademica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_fin;
    
    @ManyToOne 
    @JoinColumn (name = "persona_id")
    private Persona persona;
    
    @ManyToOne 
    @JoinColumn (name = "titulo_seccion_id")
    private TituloSeccion titulo_seccion;    

    public FormacionAcademica(Long id, String nombre, String descripcion, Date fecha_inicio, Date fecha_fin, Persona persona, TituloSeccion titulo_seccion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.persona = persona;
        this.titulo_seccion = titulo_seccion;
    }

    
    public FormacionAcademica() {
    }
    
    

  
    
    

}
