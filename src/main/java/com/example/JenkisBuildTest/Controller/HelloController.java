package com.example.JenkisBuildTest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello, world!";
	}

	@GetMapping("/greet")
	public String greet() {
		return "Greetings from Spring Boot!";
	}
}
