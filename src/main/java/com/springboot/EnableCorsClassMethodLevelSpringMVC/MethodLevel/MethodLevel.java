package com.springboot.EnableCorsClassMethodLevelSpringMVC.MethodLevel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "api/v1/cors", produces = "text/plain")
public class MethodLevel {

    // Enable method level cors
    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
    @GetMapping("/method/level")
    public ResponseEntity<String> getPlainText() {
        // Logic to generate plain text
        String plainText = "Hello, this is plain text response from the enabled method level cors.";

        // ResponseEntity with the plain text and status code
        return ResponseEntity.ok(plainText);
    }
}
