package com.example.JenkisBuildTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsBuildTestApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsBuildTestApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application Started in Jenkis");
	}

	public static void main(String[] args) {
		logger.info("Application Excuted in Jenkis");
		SpringApplication.run(JenkinsBuildTestApplication.class, args);
	}

}
