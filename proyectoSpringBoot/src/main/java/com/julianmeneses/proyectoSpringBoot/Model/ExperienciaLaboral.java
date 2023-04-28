
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
@Table(name = "experiencias_laborales")
public class ExperienciaLaboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "experiencias_laborales_seq", sequenceName = "experiencias_laborales_seq", allocationSize = 1) 
    private Long id;
    private String nombre_empresa;
    @Column(length = 1000)
    private String descripcion;
    private String fecha_inicio;
    private String fecha_fin;
    private String puesto;
    private String url;
    private String posicion_Y;
    
    @ManyToOne 
    @JoinColumn (name = "persona_id")
    private Persona persona;
    
    @ManyToOne
    @JoinColumn (name = "titulo_seccion_id")
    private TituloSeccion titulo_seccion;    

    public ExperienciaLaboral(Long id, String nombre_empresa, String descripcion, String fecha_inicio, String fecha_fin, String puesto, String url, String posicion_Y, Persona persona, TituloSeccion titulo_seccion) {
        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.puesto = puesto;
        this.url = url;
        this.posicion_Y = posicion_Y;
        this.persona = persona;
        this.titulo_seccion = titulo_seccion;
    }
    
    public ExperienciaLaboral() {
    }
    
    

  
    
    

}
