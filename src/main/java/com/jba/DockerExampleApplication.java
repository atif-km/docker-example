package com.jba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerExampleApplication.class, args);
	}
	
	@GetMapping("/web-app")
	public ResponseEntity<?> getName(){
		
		return new ResponseEntity<String>("Welcome To Spring Boot",HttpStatus.OK);
		
	}

}
