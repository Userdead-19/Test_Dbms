package com.databasemanagementapplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.databasemanagementapplication.Service.StudentService;

import jakarta.validation.Valid;

import com.databasemanagementapplication.Model.Student;
import java.util.List;
import java.util.stream.Collectors;

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

    @PostMapping("/insert")
    public ResponseEntity<Object> insertAStudent(@Valid @RequestBody Student student,BindingResult result) {
       if(result.hasErrors()){
           List<String> errors = result.getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList());
           return ResponseEntity.badRequest().body(errors);
       } 
       studentService.insertAStudent(student);
       return ResponseEntity.ok().body("Student inserted successfully");

    }
}
