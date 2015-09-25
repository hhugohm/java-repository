package org.neos.patterns.dao.test;

import org.neos.patterns.dao.Employee;
import org.neos.patterns.dao.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

	public static void main(String[] args) {
		ApplicationContext context = 
	    		new ClassPathXmlApplicationContext("spring-module.xml");
		
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDAO");
		
		Employee employee= dao.getEmployeeById(1);
		System.out.println(employee.getId_employee() + employee.getName()+employee.getLast_name());

	}

}
