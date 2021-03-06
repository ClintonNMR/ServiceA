package com.service1.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Service1Application {

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}
	
	@GetMapping("/serA")
	public String serA() {
		return "String in service A is good"; 
	}
	
	@GetMapping("/serB")
	public String serB() {
		return "String in service B is good";
	}
	

}
