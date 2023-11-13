package com.springboot.EnableCorsClassMethodLevelSpringMVC.ClassLevel;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ClassLevelController {
}
