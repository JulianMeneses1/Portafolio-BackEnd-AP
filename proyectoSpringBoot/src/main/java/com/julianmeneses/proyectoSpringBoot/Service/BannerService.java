
package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.Banner;
import com.julianmeneses.proyectoSpringBoot.Repository.BannerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerService implements IBannerService {
    
    @Autowired
    public BannerRepository bannerRepository;

    @Override
    public List<Banner> obtenerBanners() {
        return bannerRepository.findAll();
    }

    @Override
    public Banner obtenerBanner(Long id) {
        return bannerRepository.findById(id).orElse(null);
    }

    @Override
    public void crearBanner(Banner banner) {
        bannerRepository.save(banner);
        
    }

 

}
