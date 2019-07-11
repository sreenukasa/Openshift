package com.example.openshift.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SampleApiApplication {

	@GetMapping("/kasa")
	public String welcome() {
		return "Welcome to the Kasa API";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleApiApplication.class, args);
	}

}
