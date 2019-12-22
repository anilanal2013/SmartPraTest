package com.sgl.smartpra.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SmartPraTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartPraTestApplication.class, args);
	}

}
