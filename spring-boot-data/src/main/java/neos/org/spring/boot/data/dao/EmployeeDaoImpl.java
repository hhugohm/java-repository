package neos.org.spring.boot.data.dao;

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
}
