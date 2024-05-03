package com.databasemanagementapplication.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.databasemanagementapplication.Model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
