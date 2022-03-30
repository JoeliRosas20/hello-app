package com.exampls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloApp1Application.class, args);
	}
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello My Freind";
	}


}
