package com.uzelac.springit;

import com.uzelac.springit.config.SpringItProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(SpringItProperties.class)
public class SpringitApplication {

    private static final Logger log = LoggerFactory.getLogger((SpringitApplication.class));

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            log.error("CommandLinerError.run();");
            log.warn("CommandLinerError.run();");
            log.info("CommandLinerError.run();");
            log.debug("CommandLinerError.run();");
            log.trace("CommandLinerError.run();");
        };
    }
}
