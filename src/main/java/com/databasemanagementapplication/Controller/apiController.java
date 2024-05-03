package com.databasemanagementapplication.Controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

class myNewData {
    public String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

@RestController
@RequestMapping("/api")
public class apiController {

    @GetMapping("/{index}")
    ResponseEntity<myNewData> getIndex(@PathVariable String index) {
        myNewData data = new myNewData();
        data.setMessage(index);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(data);
    }

    @PostMapping("/test")
    ResponseEntity<myNewData> postData(@RequestBody myNewData data) {
        return ResponseEntity.ok(data);
    }
}
