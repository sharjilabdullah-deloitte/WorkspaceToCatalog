package com.example.WorkspaceToCatalogService.WorkspaceToCatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WorkspaceToCatalogApplication {

	public static void main(String[] args) {

		SpringApplication.run(WorkspaceToCatalogApplication.class, args);
		System.out.println("Hello world");
	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
