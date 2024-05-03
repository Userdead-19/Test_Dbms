package com.databasemanagementapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
@ComponentScan(basePackages = { "com.databasemanagementapplication.Controller",
		"com.databasemanagementapplication.Service", "com.databasemanagementapplication.Repositories",
		"com.databasemanagementapplication.config" })
public class DbmsApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure().load();

		System.setProperty("dotenv", dotenv.toString());
		SpringApplication.run(DbmsApplication.class, args);
	}

	@Bean
	public Dotenv dotenv() {
		return Dotenv.configure().load();
	}

}
