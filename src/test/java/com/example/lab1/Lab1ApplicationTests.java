package com.example.lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lab1ApplicationTests {
	
	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(Lab1Application.class); 

	@Test
	void contextLoads() {
		logger.info("Its a test class");
		assertEquals(true, true);
	}

}
