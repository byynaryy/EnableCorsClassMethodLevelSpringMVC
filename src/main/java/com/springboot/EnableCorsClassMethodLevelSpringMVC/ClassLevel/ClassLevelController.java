package com.springboot.EnableCorsClassMethodLevelSpringMVC.ClassLevel;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ClassLevelController {
}