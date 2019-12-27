package com.sgl.smartpra.app;

import java.sql.SQLException;
import org.h2.tools.Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SmartPraTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartPraTestApplication.class, args);
	}

	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server h2WebConsoleServer() throws SQLException {
		return Server.createWebServer("-web", "-webAllowOthers", "-webDaemon","tcpAllowOthers","pgAllowOthers", "-webPort", "8080");
	}
}
