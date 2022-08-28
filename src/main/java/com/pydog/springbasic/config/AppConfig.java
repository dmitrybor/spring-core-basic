package com.pydog.springbasic.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.pydog.springbasic")
public class AppConfig {

    @Bean
    public String testString() {
        return "test String";
    }
}
