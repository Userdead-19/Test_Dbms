package com.databasemanagementapplication;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/api")
public class postController {

    @GetMapping("/post")
    public ResponseEntity<MyData> getPost() {
        MyData data = new MyData("Hello World");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
