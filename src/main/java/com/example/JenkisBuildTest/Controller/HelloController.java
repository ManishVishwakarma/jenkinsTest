package com.example.JenkisBuildTest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class HelloController {

	@GetMapping
	@RequestMapping("hello")
	public String getMessage() {
		return "Hello World";
	}
}
