
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
@Table(name = "experiencias_laborales")
public class ExperienciaLaboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre_empresa;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String puesto;
    private String url;
    private String posicion_Y;
    
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "persona_id")
    private Persona persona;
    
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "titulo_seccion_id")
    private TituloSeccion titulo_seccion;    

    public ExperienciaLaboral(Long id, String nombre_empresa, String descripcion, Date fecha_inicio, Date fecha_fin, String puesto, String url, String posicion_Y, Persona persona, TituloSeccion titulo_seccion) {
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
