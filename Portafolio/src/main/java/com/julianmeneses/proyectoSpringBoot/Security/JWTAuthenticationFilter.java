
package com.julianmeneses.proyectoSpringBoot.Security;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

// AUTORIZACIÓN
// CLASE QUE SE ENCARGA DE VALIDAR EL USUARIO Y CONTRASEÑA INGRESADOS POR EL USUARIO, DEVOLVIENDO UN TOKEN EN CASO EXITOSO 

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    
    
    @Override
    public Authentication attemptAuthentication (HttpServletRequest request, 
                                                 HttpServletResponse response) throws AuthenticationException {
        
        AuthCredentials authCredentials = new AuthCredentials();
        
        try {
            authCredentials = new ObjectMapper().readValue(request.getReader(),AuthCredentials.class);
            } catch (IOException e) {
                        
            }
        UsernamePasswordAuthenticationToken usernamePAT = new UsernamePasswordAuthenticationToken (
                authCredentials.getUsuario(),
                authCredentials.getContraseña(),
                Collections.emptyList()
        );
        
        
        
        return getAuthenticationManager().authenticate(usernamePAT);
    } 
    
    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {
        
        UserDetailsImpl userDetails = (UserDetailsImpl) authResult.getPrincipal();        
        String token = TokenUtils.createToken(userDetails.getNombre());
        
        response.addHeader("Authorization", "Bearer " + token);
        response.getWriter().flush();
        
        super.successfulAuthentication(request, response, chain, authResult);
    }
    

}
