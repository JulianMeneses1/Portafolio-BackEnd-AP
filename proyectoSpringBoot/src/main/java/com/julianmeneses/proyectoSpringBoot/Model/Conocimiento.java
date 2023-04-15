
package com.julianmeneses.proyectoSpringBoot.Model;

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
@Table(name = "conocimientos")
public class Conocimiento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "conocimientos_seq", sequenceName = "conocimientos_seq", allocationSize = 1)  
    private Long id;
    private String icono;
    private String nombre;
    private String porcentaje_progreso;
    
    
    @ManyToOne
    @JoinColumn (name = "persona_id")
    private Persona persona;
    
    @ManyToOne
    @JoinColumn (name = "titulo_seccion_id")
    private TituloSeccion titulo_seccion;    

    public Conocimiento(Long id, String icono, String nombre, String porcentaje_progreso, Persona persona, TituloSeccion titulo_seccion) {
        this.id = id;
        this.icono = icono;
        this.nombre = nombre;
        this.porcentaje_progreso = porcentaje_progreso;
        this.persona = persona;
        this.titulo_seccion = titulo_seccion;
    }
   
    public Conocimiento() {
    }
    

}
