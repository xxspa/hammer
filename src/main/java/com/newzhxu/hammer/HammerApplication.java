package com.newzhxu.hammer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HammerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HammerApplication.class, args);
    }

    @Bean
    CommandLineRunner init() {
        return args -> {

        };
    }


}
