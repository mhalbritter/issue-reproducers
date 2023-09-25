package com.example.sb37557;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SpringAddonsOidcProperties.class)
public class Sb37557Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb37557Application.class, args);
    }

}
