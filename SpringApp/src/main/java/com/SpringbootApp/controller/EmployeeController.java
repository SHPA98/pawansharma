package com.SpringbootApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringbootApp.model.Employee;

public class EmployeeController {

	private Employee employeeService;

	public EmployeeController(Employee employeeService) {
		super();
		this.employeeService = employeeService;
	}
	 
	 @PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	 
	@RestController
	public class HelloWordController {
	
	@GetMapping("/helloworld")
	
public String Helloworld() {
			return "Hello world!";
	}
	
	}

}
