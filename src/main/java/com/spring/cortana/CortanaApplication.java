package com.spring.cortana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.spring.cortana.controller"})
@EnableConfigurationProperties({//To enable ConfigurationProperties feature in the SpringBoot App	
})
public class CortanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CortanaApplication.class, args);
	}

}
