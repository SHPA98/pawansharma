package com.SpringbootApp.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
