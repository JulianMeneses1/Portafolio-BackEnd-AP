
package com.julianmeneses.proyectoSpringBoot.Service;

import com.julianmeneses.proyectoSpringBoot.Model.Email;
import jakarta.mail.internet.MimeMessage;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmailService {
    
    @Autowired
    JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String email;
    
    public void sendEmail(String emailTo, Email datos) {
        MimeMessage message = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper (message, true);
            helper.setFrom(email);
            helper.setTo(emailTo);
            helper.setSubject(datos.getAsunto());
            helper.setText(datos.getMensaje());
            javaMailSender.send(message);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }

}
