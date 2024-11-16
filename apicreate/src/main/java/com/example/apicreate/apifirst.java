package com.example.apicreate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apifirst {
	
	int c;
	
	
	@GetMapping("/printresponse")
	public String printresponse() {
		return "Hello Swaroop this is Rest API via Spring Boot and your response is good";
	}
	
	@GetMapping("/value")
	public int value() {
		int salary;
		return salary=1000;
	}
	
	@PostMapping("/addition")
	public int add(int c) {
		int a = 10;
		int b;
		this.c=c;
		return b = a + c;
	}
}
