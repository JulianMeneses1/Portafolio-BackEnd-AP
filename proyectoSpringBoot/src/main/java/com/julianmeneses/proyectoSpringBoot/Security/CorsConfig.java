
package com.julianmeneses.proyectoSpringBoot.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// CLASE PARA CONFIGURAR EL CORS: MECANISMO DE SEGURIDAD QUE IMPLEMENTA EL NAVEGADOR PARA VALIDAR CUALQUIER SOLICITUD HTTP QUE SE HACE A UNA API DESDE UN ORIGEN DIFERENTE AL DE LA API, 
// O SEA BÁSICAMENTE DESDE CUALQUIER APLICACIÓN CLIENTE)

@Configuration
public class CorsConfig {
    
    @Bean
    public WebMvcConfigurer corsConfigurer () {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // acá establecemos la url cuyo cors vamos a configurar, en este caso login
                        .allowedOrigins("*")    // acá establecemos cuáles son los orígenes que van a estar autorizados, ponemos todos
                        .allowedMethods("*")    // acá establecemos los métodos que se van a permitir, vuelve a ser todos
                        .exposedHeaders("*");   // con esto autorizamos que el navegador pueda acceder y guardar en su cache todos los headers de la respuesta (esto lo hacemos 
                                                       // para poder acceder al token, que está en el header)         
            }
        };
    }

}
