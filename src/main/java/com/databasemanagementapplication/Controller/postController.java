package com.databasemanagementapplication.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class MyData {
    private String data;

    public MyData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

}

@RestController
public class postController {
    @GetMapping("/")
    ResponseEntity<String> index() {
        return ResponseEntity.ok("This is the backend SDK of the Database Management Application");
    }

}
