
package com.julianmeneses.proyectoSpringBoot.Service;

import jakarta.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


// SERVICIO PARA ALMACENAR LAS IMÁGENES QUE SE SUBAN (SE GUARDAN EN LA CARPETA "IMAGENES" CUYO NOMBRE DEFINIMOS EN APPLICATION.PROPERTIES)

@Service
public class StorageService implements IStorageService {
    
    // establecemos la ruta donde se almacenan los archivos para poder acceder a ellos
    
    @Value("${media.location}")
    private String mediaLocation;
    
    private Path rootLocation;
    
    // función para establecer la ruta y crear la carpeta donde se van a guardar los archivos si no existe

    @Override
    @PostConstruct
    public void init() throws IOException {
        rootLocation = Paths.get(mediaLocation);
        Files.createDirectories(rootLocation);
        
    }
    
    //función para guardar el archivo
    
    @Override
    public String store(MultipartFile file) {
        try {
                if (file.isEmpty()) {
                throw new RuntimeException("No se puede almacenar un archivo vacío");
                }
            String filename = file.getOriginalFilename();
            Path destinationFile = rootLocation.resolve(Paths.get(filename))
                    .normalize().toAbsolutePath();
            
            //si el archivo ya existe se lo reemplaza
            
            try (InputStream inputStream = file.getInputStream()) {
                Files.copy(inputStream, destinationFile, StandardCopyOption.REPLACE_EXISTING);
            }
            return filename;
        } catch (IOException e) {
            throw new RuntimeException("No se puede almacenar un archivo vacío", e);
        }
        
    }
    
    // función para leer un archivo

    @Override
    public Resource loadAsResource(String filename) {
        try {
            Path file = rootLocation.resolve(filename);           
            Resource resource = new UrlResource((file.toUri()));
        
            if (resource.exists() || resource.isReadable()) {
            return resource;
            } else {
            throw new RuntimeException("No se pudo leer el archivo" + filename);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException("No se pudo leer el archivo" + filename);
        }
    }
}
