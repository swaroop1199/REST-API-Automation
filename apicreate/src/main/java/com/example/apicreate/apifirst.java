package com.example.apicreate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api")
public class apifirst {
	
	int c;
	
	@GetMapping("/swaroop's_printresponse")
	public String Swaroop_printresponse() {
		return "Hello Swaroop this is Rest API via Spring Boot and your response is good";
	}
	
	
	@GetMapping("/getcar/car")
	public carnames getcar() {
		carnames carnames = new carnames(7580,"BMW","Germany");
		return carnames;
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
