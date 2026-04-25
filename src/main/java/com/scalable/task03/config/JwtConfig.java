package com.scalable.task03.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtConfig {
    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private long expiration;

    // TODO: See Task 3 spec — JwtConfig.

    public String getSecret() {
        return null;
    }

    public long getExpiration() {
        return 0L;
    }
}
