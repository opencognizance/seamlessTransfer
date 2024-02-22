package com.seamlesstransfer.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration {
   
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(authz -> authz
	            .requestMatchers("/h2-console").permitAll()
	            .anyRequest().authenticated());
	}
}
