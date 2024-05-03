package com.databasemanagementapplication.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(basePackages = "com.databasemanagementapplication.repositories")
public class MongoDBconfig extends AbstractMongoClientConfiguration {

    @Override
    public String getDatabaseName() {
        return "Student";
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb+srv://admin:alo4567@cluster0.7qx0l5f.mongodb.net/");
    }
}
