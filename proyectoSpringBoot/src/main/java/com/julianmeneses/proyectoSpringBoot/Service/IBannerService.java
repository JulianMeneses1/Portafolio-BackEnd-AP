

package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.Banner;
import java.util.List;


public interface IBannerService {
    public List<Banner> obtenerBanners ();
    
    public Banner obtenerBanner(Long id);  
    
    public void editarBanner (Banner banner,String imagen_banner, String  imagen_perfil, String titulo, String subtitulo);

    
}
