package com.example.EmployeeDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MilestoneAssesment4Application {
	
	@GetMapping("/emploee")
	public String employee()
	{
		return "Welcome to Spring with docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(MilestoneAssesment4Application.class, args);
	}

}
