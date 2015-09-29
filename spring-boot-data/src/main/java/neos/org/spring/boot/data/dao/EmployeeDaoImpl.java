package neos.org.spring.boot.data.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neos.org.spring.boot.data.domain.Employee;

@Service
public class EmployeeDaoImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao  employeeDao;

	@Override
	public Employee findByEmployeeId(Integer id) {
		return employeeDao.findByIdEmployee(id);
	}
	
	@Override
	public List<Employee> allEmployees() {
		return employeeDao.findAll();
	}
	
	@Override
	public void saveEmployee(Employee employee) {
		employeeDao.save(employee);
	}
}
