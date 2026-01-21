package com.newzhxu.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
    @Bean
    HelloGreeting helloGreeting() {
        return new HelloGreeting();
    }
}
