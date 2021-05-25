package com.send2abhishek.spring.springbootbasics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/emp")
	public Employee getEmployee() {
		System.out.println("emp controller");
		return new Employee(1, "Abhishek", "Banaglore");
	}

}
