package neos.org.spring.boot.data.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	

	@RequestMapping(value = "/getEmployeeById/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeId(@PathVariable("id")Integer id,HttpServletResponse response) {
		Employee employee=null;;
		try {
			employee = employeeDao.findByEmployeeId(id);
			System.out.println("NOMBRE: " +employee.getName());
		
		} catch (Exception ex) {
			ex.printStackTrace();
			return employee;
		}
		 response.setHeader("Access-Control-Allow-Origin", "*");
         response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
         response.setHeader("Access-Control-Max-Age", "3600");
         response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
		return employee;
	}
	@RequestMapping(value = "getAllEmployees",
			produces = MediaType.APPLICATION_JSON_VALUE)
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
	
	@RequestMapping(value = "createEmployee",
			method = RequestMethod.POST,
			produces = "text/plain; charset=utf-8")
	public @ResponseBody String saveEmployee(@PathParam("name") String name,
										@PathParam("lastName")String lastName) {
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
	
	@RequestMapping(value = "createJsonEmployee",
			method = {RequestMethod.GET, RequestMethod.POST},
			consumes= MediaType.APPLICATION_JSON_VALUE,
			produces = "text/plain; charset=utf-8")
	public @ResponseBody String saveJsonEmployee(@RequestBody Employee employee) {
		System.out.println("EN EL CONTROLADOR JSON:::::::");
		System.out.println("employee-name: "+ employee.getName());
		System.out.println("employee-last name"+employee.getLastName());
		
		try {
			employeeDao.saveEmployee(employee);
		
		} catch (Exception ex) {
			ex.printStackTrace();
			return "faild";
		}
		return "successful";
	}

}
