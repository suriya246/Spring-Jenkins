package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinApplicationDemo {

	public static Logger logger=LoggerFactory.getLogger(JenkinApplicationDemo.class);
	
	@PostConstruct
	public void intt() {
		logger.info("Application Started....");
	}
	public static void main(String[] args) {
		logger.info("Application Ececuted...");
		SpringApplication.run(JenkinApplicationDemo.class, args);	
	}

}

