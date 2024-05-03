package com.databasemanagementapplication;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class apiController {
    @GetMapping("/")
    ResponseEntity<String> index() {
        return ResponseEntity.ok("This is the backend SDK of the Database Management Application");
    }
}
