package com.SpringbootApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringbootApp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
