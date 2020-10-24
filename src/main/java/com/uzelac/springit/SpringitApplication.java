package com.uzelac.springit;

import com.uzelac.springit.config.SpringItProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SpringItProperties.class)
public class SpringitApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }

}
