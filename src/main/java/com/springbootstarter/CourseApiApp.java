package com.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	CourseApiApp(){
		System.out.println("Hello World!!");
	}
	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}

}
