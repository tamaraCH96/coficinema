package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.curso.controller","com.curso.service","com.curso.inicio"})
@EnableJpaRepositories(basePackages = ("com.curso.dao"))
@EntityScan(basePackages = "com.curso.model")

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
