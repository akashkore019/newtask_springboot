//package com.akash.organization.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable()  // Disable CSRF if you don't need it
//            .authorizeRequests()
//            .requestMatchers("/**").permitAll()  // Allow all requests
//            .anyRequest().authenticated();  // You can modify this line as needed for specific endpoints
//
//        return http.build();
//    }
//}
