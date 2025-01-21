package com.example.ZugData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.ZugData")
public class ZugDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZugDataApplication.class, args);
	}

}
