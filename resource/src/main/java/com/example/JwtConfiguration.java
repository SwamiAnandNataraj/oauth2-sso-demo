package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class JwtConfiguration {

    @Bean
    @ConfigurationProperties("jwt")
    JwtAccessTokenConverter jwtAccessTokenConverter() {
        return new JwtAccessTokenConverter();
    }

    @Bean
    @Qualifier("tokenStore")
    public TokenStore tokenStore() {

        return new JwtTokenStore(jwtAccessTokenConverter());
    }

}
