package com.databasemanagementapplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.databasemanagementapplication.Model.Student;
import com.databasemanagementapplication.Repositories.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student insertAStudent(Student student) {
        return studentRepository.save(student);
    }
}
