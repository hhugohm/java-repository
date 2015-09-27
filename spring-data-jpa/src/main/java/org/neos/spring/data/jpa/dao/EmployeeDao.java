package org.neos.spring.data.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Hector Hugo Midalgo
 * 27/09/2015
 * This clase has a mapping for Employee Repository
 *
 */
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
