package com.example.blog.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.Map;

@Component
public class JwtUtil {
    private static SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private static Long expire=60*60*1000*3L;
    public static String generateJwt(Map<String,Object>claims){
        String jwt = Jwts.builder()
                .setClaims(claims)
                .signWith(key, SignatureAlgorithm.HS256)
                .setExpiration(new Date(System.currentTimeMillis() + expire)) // 1 hour from now
                .compact();

        return jwt;
    }
    public static Claims parseJwt(String jwt){
        Claims claim=Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJws(jwt)
                .getBody();
        return claim;
    }
}
