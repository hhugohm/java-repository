package neos.org.spring.boot.data.dao;

import java.util.List;

import neos.org.spring.boot.data.domain.Employee;

public interface EmployeeService  {
	
	public Employee findByEmployeeId(Integer id);
	public List<Employee> allEmployees();
	public void saveEmployee(Employee employee);

}
