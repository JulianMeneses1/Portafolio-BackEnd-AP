package com.julianmeneses.proyectoSpringBoot;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition (
        info = @Info(
            title="App Portafolio",
            version = "1.0.0",
            description = "Mi CV online"             
        ),
        servers = {
        @Server(url = "/", description = "Default Server URL")
        }
)
public class ProyectoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringBootApplication.class, args);
	}    
}
