package com.restAPI;

import com.restAPI.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication {
	@Autowired
	Student student;

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);

	}

}
