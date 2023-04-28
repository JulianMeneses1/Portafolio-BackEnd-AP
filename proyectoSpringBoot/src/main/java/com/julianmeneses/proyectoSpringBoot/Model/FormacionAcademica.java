
package com.julianmeneses.proyectoSpringBoot.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "formaciones_academicas")
public class FormacionAcademica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "formaciones_academicas_seq", sequenceName = "formaciones_academicas_seq", allocationSize = 1) 
    private Long id;
    private String nombre;
    @Column(length = 1000)
    private String descripcion;
    private String fecha_inicio;
    private String fecha_fin;
    private String institucion;
    private String imagen;
    private String url_certificado;
    private String url_institucion;
    
    @ManyToOne 
    @JoinColumn (name = "persona_id")
    private Persona persona;
    
    @ManyToOne 
    @JoinColumn (name = "titulo_seccion_id")
    private TituloSeccion titulo_seccion;    

    public FormacionAcademica(Long id, String nombre, String descripcion, String fecha_inicio, 
            String fecha_fin, String institucion, String imagen, String url_certificado, String url_institucion, 
            Persona persona, TituloSeccion titulo_seccion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.institucion = institucion;
        this.imagen = imagen;
        this.url_certificado = url_certificado;
        this.url_institucion = url_institucion;
        this.persona = persona;
        this.titulo_seccion = titulo_seccion;
    }

   

    

    
    public FormacionAcademica() {
    }
    
    

  
    
    

}
