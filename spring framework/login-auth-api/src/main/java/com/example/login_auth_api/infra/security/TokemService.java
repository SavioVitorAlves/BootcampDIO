package com.example.login_auth_api.infra.security;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.example.login_auth_api.domain.users.user;

@Service
public class TokemService {
    @Value("${api.security.tokem.secrety}")
    private String secrety;
    public String genereteTokem(user user){
        try {
            Algorithm algorithm = Algorithm.HMAC256(secrety);

            String tokem = JWT.create()
                .withIssuer("login-auth-api")
                .withSubject(user.getEmail())
                .withExpiresAt(this.generateExpirationDate())
                .sign(algorithm);
            return tokem;
            
            } catch (JWTCreationException exception) {
            throw new RuntimeException("Error while authenticatiwng");
        }
        
    }
 
    public String validateTokem(String tokem){
       try {
        Algorithm algorithm = Algorithm.HMAC256(secrety);
        return JWT.require(algorithm)
            .withIssuer("login-auth-api")
            .build()
            .verify(tokem)
            .getSubject(); 
       } catch (JWTVerificationException exception) {
        return null;
       } 
    }

    private Instant generateExpirationDate(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }
}
