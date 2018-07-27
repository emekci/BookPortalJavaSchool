package com.obss.springmvc.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
    	http
        .cors().and().authorizeRequests().antMatchers(HttpMethod.OPTIONS).permitAll().and()
        .authorizeRequests()
        .antMatchers("**").permitAll()
        .and()
        .csrf().disable();
    }
    
    @SuppressWarnings("deprecation")
	@Bean
    public WebMvcConfigurerAdapter corsConfigurer() {
      return new WebMvcConfigurerAdapter() {
        public void addCorsMappings(CorsRegistry registry) {
          registry.addMapping("/**").allowedOrigins("*").allowedMethods("POST", "GET", "PUT",
              "DELETE");
        }
      };
    }
}