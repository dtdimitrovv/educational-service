package com.example.educationalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EducationalServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EducationalServiceApplication.class, args);
    }

}
