package com.databasemanagementapplication.Controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class myNewData {
    public String Message;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}

@RestController
@RequestMapping("/api")
public class apiController {
    @GetMapping("/{index}")
    ResponseEntity<myNewData> index(@PathVariable String index) {
        myNewData data = new myNewData();
        data.setMessage(index);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(data);
    }

    @RequestMapping("/test")
    ResponseEntity<myNewData> index(@RequestBody myNewData data) {
        return ResponseEntity.ok(data);
    }
}
