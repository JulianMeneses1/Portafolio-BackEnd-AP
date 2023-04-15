
package com.julianmeneses.proyectoSpringBoot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "proyectos")
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "proyectos_seq", sequenceName = "proyectos_seq", allocationSize = 1) 
    private Long id;
    private String imagen;
    private String descripcion;
    private String nombre;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String url_github;
    private String url_sitio_web;
    private String tecnologias;    
    
    @ManyToOne
    @JoinColumn (name = "persona_id")
    private Persona persona;
    
    @ManyToOne
    @JoinColumn (name = "titulo_seccion_id")
    private TituloSeccion titulo_seccion;    

    public Proyecto(Long id, String imagen, String descripcion, String nombre, Date fecha_inicio, Date fecha_fin, 
            String url_github, String url_sitio_web, String tecnologias, Persona persona, TituloSeccion titulo_seccion) {
        this.id = id;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.url_github = url_github;
        this.url_sitio_web = url_sitio_web;
        this.tecnologias = tecnologias;
        this.persona = persona;
        this.titulo_seccion = titulo_seccion;
    }

   
    
    public Proyecto() {
    }
    
    

  
    
    

}
