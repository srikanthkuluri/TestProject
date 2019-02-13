package com.slokam.SpringBootProject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProjectApplication {

	final static Logger logger = Logger.getLogger(SpringBootProjectApplication.class);
	
	public static void main(String[] args) {
		
		//this below log4j files written by me
		//new Re
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("welcome to debug mode srikanth");
		logger.info("pojo");
		logger.error("hello error");
		
		SpringApplication.run(SpringBootProjectApplication.class, args);
		
		
	}
}
