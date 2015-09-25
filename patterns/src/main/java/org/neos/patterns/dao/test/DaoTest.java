package org.neos.patterns.dao.test;

import org.neos.patterns.dao.Employee;
import org.neos.patterns.dao.EmployeeDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context =
				 new ClassPathXmlApplicationContext("spring-module.xml");
		
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
		
		Employee employee= dao.getEmployeeById(1);
		System.out.println("Employee: "+ employee.getIdEmployee() 
		+ " "+employee.getName()
		+ " "+employee.getLastName());
		
		context.close();

	}

}
