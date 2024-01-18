package com.example.blog.utils;

import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public interface JwtUtils {
    public String generateToken(Long userId);
    public Claims getClaimByToken(String token);
    public boolean isTokenExpired(Date expiration);
}
