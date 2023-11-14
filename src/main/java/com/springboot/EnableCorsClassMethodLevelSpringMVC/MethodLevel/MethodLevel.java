package com.springboot.EnableCorsClassMethodLevelSpringMVC.MethodLevel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/cors", produces = "text/plain")
public class MethodLevel {
}
