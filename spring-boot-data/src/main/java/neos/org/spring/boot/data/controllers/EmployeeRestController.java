package neos.org.spring.boot.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import neos.org.spring.boot.data.dao.EmployeeService;
import neos.org.spring.boot.data.domain.Employee;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeRestController {
	
	@Autowired
	private  EmployeeService employeeDao;

	@RequestMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeId(@PathVariable("id")Integer id) {
		Employee employee=null;;
		try {
			employee = employeeDao.findByEmployeeId(id);
			System.out.println("NOMBRE: " +employee.getName());
		
		} catch (Exception ex) {
			ex.printStackTrace();
			return employee;
		}
		return employee;
	}
	@RequestMapping(value = "ltsEmployees",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getLtsEmployeesd() {
		List<Employee> lstEmployee=null;;
		try {
			lstEmployee = employeeDao.allEmployees();
		
		
		} catch (Exception ex) {
			ex.printStackTrace();
			return lstEmployee;
		}
		return lstEmployee;
	}

}
