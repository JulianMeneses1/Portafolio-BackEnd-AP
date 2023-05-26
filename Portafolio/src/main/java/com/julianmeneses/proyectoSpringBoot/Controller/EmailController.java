
package com.julianmeneses.proyectoSpringBoot.Controller;

import com.julianmeneses.proyectoSpringBoot.Model.Email;
import com.julianmeneses.proyectoSpringBoot.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmailController {
    
    @Autowired
    EmailService servicioEmail;
    
    @PostMapping("/enviarmail")
    public void enviarEmail (@RequestBody Email datos) {
        this.servicioEmail.sendEmail("julian.meneses11@gmail.com",datos);
    }

}
