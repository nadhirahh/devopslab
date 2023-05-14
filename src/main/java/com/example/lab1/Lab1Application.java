package com.example.lab1;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1Application implements CommandLineRunner {
	
	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(Lab1Application.class); 

	public static void main(String[] args) {
		logger.info("Its a continuous integration");
		SpringApplication.run(Lab1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Its my second logger")
		
	}

}
