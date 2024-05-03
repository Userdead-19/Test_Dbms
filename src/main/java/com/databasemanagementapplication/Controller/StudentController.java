package com.databasemanagementapplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.databasemanagementapplication.Service.StudentService;
import com.databasemanagementapplication.Model.Student;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() {
        try {
            return ResponseEntity.ok(studentService.getAllStudents());
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/inset")
    public ResponseEntity<Student> insertAStudent(@RequestBody Student student) {
        try {
            return ResponseEntity.ok(studentService.insertAStudent(student));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
