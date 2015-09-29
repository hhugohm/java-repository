package neos.org.spring.boot.data.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import neos.org.spring.boot.data.dao.EmployeeService;
import neos.org.spring.boot.data.domain.Employee;

@Controller
public class EmployeeController {

	
	@Autowired
	private  EmployeeService employeeDao;


	@RequestMapping("/get-by-id")
	@ResponseBody
	public String geById(int id) {
		Employee employee;
		try {
			employee = employeeDao.findByEmployeeId(id);
		
		} catch (Exception ex) {
			return "User not found";
		}
		return "The employee  is: " + employee.getIdEmployee()+" "+employee.getName()+" "+employee.getLastName();
	}


}
