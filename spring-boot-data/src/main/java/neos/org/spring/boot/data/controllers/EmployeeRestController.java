package neos.org.spring.boot.data.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import neos.org.spring.boot.data.dao.EmployeeDao;
import neos.org.spring.boot.data.dao.EmployeeService;
import neos.org.spring.boot.data.domain.Employee;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeRestController {
	
	@Autowired
	private  EmployeeService employeeDao;
	@Autowired
	private  EmployeeDao dao;
	

	@RequestMapping(value = "/getEmployeeById/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
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
	@RequestMapping(value = "getAllEmployees",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getLtsEmployees() {
		List<Employee> lstEmployee=null;;
		try {
			lstEmployee = dao.findAll();
			for(Employee employee: lstEmployee){
				System.out.println(employee.getName());
			}
		
		
		} catch (Exception ex) {
			ex.printStackTrace();
			return lstEmployee;
		}
		return lstEmployee;
	}
	
	@RequestMapping(value = "createEmployee",method = RequestMethod.POST)
	public @ResponseBody String saveEmployee(@PathParam("name") String name,@PathParam("lastName")String lastName) {
		System.out.println("EN EL CONTROLADOR:::::::");
		System.out.println("name: "+ name);
		System.out.println("last name"+lastName);
		Employee employee = new Employee(name,lastName);
		
		try {
			employeeDao.saveEmployee(employee);
		
		} catch (Exception ex) {
			ex.printStackTrace();
			return "faild";
		}
		return "successful";
	}

}
