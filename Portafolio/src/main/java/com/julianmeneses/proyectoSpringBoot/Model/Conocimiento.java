
package com.julianmeneses.proyectoSpringBoot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "conocimientos")
public class Conocimiento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imagen;
    private String nombre;
    private String nivel;    
    
    @ManyToOne
    @JoinColumn (name = "persona_id")
    private Persona persona;
    
    @ManyToOne
    @JoinColumn (name = "titulo_seccion_id")
    private TituloSeccion titulo_seccion;    

    public Conocimiento(Long id, String imagen, String nombre, String nivel, Persona persona, TituloSeccion titulo_seccion) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.nivel = nivel;
        this.persona = persona;
        this.titulo_seccion = titulo_seccion;
    }
   
    public Conocimiento() {
    }
    

}
