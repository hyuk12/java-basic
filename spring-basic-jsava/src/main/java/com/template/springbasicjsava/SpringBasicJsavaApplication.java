package com.template.springbasicjsava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBasicJsavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBasicJsavaApplication.class, args);
    }

}
