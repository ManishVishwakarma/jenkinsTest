package com.example.JenkisBuildTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsBuildTestApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsBuildTestApplicationTests.class);

	@Test
	void contextLoads() {
		
		logger.info("New logger added");
		
		logger.info("Test Case Exceuted");
		assertEquals(true, true);
	}

}
