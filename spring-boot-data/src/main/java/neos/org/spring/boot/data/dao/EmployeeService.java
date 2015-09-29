package neos.org.spring.boot.data.dao;

import neos.org.spring.boot.data.domain.Employee;

public interface EmployeeService  {
	
	public Employee findByEmployeeId(Integer id);

}
