package com.example.springbootdemocrmcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication

public class SpringBootDemoCrmCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoCrmCrudApplication.class, args);
	}

}
