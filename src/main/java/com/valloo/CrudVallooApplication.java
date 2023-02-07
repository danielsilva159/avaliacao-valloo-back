package com.valloo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.valloo.repositories")
public class CrudVallooApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudVallooApplication.class, args);
	}

}