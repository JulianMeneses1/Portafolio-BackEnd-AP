
package com.julianmeneses.proyectoSpringBoot.Controller;

import com.julianmeneses.proyectoSpringBoot.Model.Banner;
import com.julianmeneses.proyectoSpringBoot.Service.IBannerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BannerController {
    
    @Autowired
    public IBannerService bannerService;
    
    @GetMapping ("/obtener/banners")
    public List <Banner> obtenerBanners () {
        
        return bannerService.obtenerBanners();
    }
    
    @GetMapping ("/obtener/banner/{id}")
    public Banner obtenerBanner (@PathVariable Long id) {
        
        return bannerService.obtenerBanner(id);
    }   
    
    @PutMapping ("/editar/banner/{id}")
    public Banner editarBanner (@PathVariable Long id, 
                                        @RequestBody Banner banner) {
        banner.setId(id);
        bannerService.crearBanner(banner); 
        
        return banner;
    }
  
    
    @PostMapping ("/crear/banner")
    public void crearBanner (@RequestBody Banner banner) {
        
     bannerService.crearBanner(banner); 

    }
}
