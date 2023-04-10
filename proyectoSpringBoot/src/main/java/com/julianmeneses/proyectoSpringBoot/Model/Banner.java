
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
@Table(name = "banners")
public class Banner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String imagen_banner;
    private String imagen_perfil;
    private String titulo;
    private String subtitulo;
    
    @OneToOne (mappedBy = "banner")
    private Persona persona;

    public Banner(Long id, String imagen_banner, String imagen_perfil, String titulo, String subtitulo, Persona persona) {
        this.id = id;
        this.imagen_banner = imagen_banner;
        this.imagen_perfil = imagen_perfil;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.persona = persona;
    }

    

    public Banner() {
    }
    
    

  
    
    

}
