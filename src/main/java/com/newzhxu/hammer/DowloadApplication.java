package com.newzhxu.hammer;

import com.newzhxu.hammer.service.DownloadService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DowloadApplication {

    public static void main(String[] args) {
        SpringApplication.run(DowloadApplication.class, args);
    }

    @Bean
    CommandLineRunner init(DownloadService loliApi) {
        return args -> {
            for (int i = 0; i < 1000; i++) {
                loliApi.download(String.valueOf(i));
            }
            System.out.println("All download tasks have been initiated.");

        };
    }


}
