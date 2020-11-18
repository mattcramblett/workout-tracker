package com.sportive.sportiveserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan({"com.sportive"})
public class SportiveServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportiveServerApplication.class, args);
    }

}
