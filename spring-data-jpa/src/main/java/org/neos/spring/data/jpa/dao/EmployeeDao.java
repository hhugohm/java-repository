package org.neos.spring.data.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("registrationBean")
public class EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeDao() {

	}
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
}
