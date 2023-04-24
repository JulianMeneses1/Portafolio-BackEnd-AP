
package com.julianmeneses.proyectoSpringBoot.Controller;

// Controlador para la suba de archivos (en este caso son todas imagenes)

import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.julianmeneses.proyectoSpringBoot.Service.IStorageService;


@RestController
@AllArgsConstructor
public class ArchivosController {    
    
    private final IStorageService storageService;  
    private final HttpServletRequest request;
    
    
    @PostMapping ("/subir/archivo")
    public Map<String, String> uploadFile (@RequestParam("file") MultipartFile multipartFile) {
        String path = storageService.store(multipartFile);
        String host = request.getRequestURL().toString().replace(request.getRequestURI(), "");
        String url = ServletUriComponentsBuilder
                .fromHttpUrl(host)
                .path("/obtener/archivo/")
                .path(path)
                .toUriString();
        return Map.of("url",url);
    }
    
    @GetMapping ("obtener/archivo/{nombreArchivo}")
    public ResponseEntity <Resource> getFile(@PathVariable String nombreArchivo) throws IOException {
        Resource file = storageService.loadAsResource(nombreArchivo);
        String contentType = Files.probeContentType(file.getFile().toPath());
        
        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_TYPE, contentType)
                .body(file);
    }

}
