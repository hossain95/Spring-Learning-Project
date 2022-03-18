package com.example.springlearningproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringLearningProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLearningProjectApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                System.out.println("here");
                registry.addMapping("/**").allowedOrigins("http://localhost:8080").allowedMethods("GET", "POST","PUT", "DELETE" )
                        .allowedHeaders("header1", "header2", "header3")
                        .exposedHeaders("header1", "header2")
                        .allowCredentials(false).maxAge(3600);;
            }
        };
    }
}
