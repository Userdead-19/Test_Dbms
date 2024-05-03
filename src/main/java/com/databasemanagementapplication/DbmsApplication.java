package com.databasemanagementapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.databasemanagementapplication.Controller",
		"com.databasemanagementapplication.Service", "com.databasemanagementapplication.Repositories",
		"com.databasemanagementapplication.config" })
public class DbmsApplication {

	public static void main(String[] args) {

		SpringApplication.run(DbmsApplication.class, args);
	}

}
