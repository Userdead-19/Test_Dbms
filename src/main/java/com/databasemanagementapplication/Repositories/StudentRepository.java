package com.databasemanagementapplication.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.databasemanagementapplication.Model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}
