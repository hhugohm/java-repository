package org.neos.spring.data.jpa.test;



import org.neos.spring.data.jpa.dao.EmployeeDao;
import org.neos.spring.data.jpa.entity.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelectByIdTest {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context =
				 new ClassPathXmlApplicationContext("spring-module.xml");
		
		 EmployeeDao dao = (EmployeeDao) context.getBean("registrationBean");
		
		Employee employee= dao.getEmployeeRepository().findByidEmployee(2);
		System.out.println("Employee: "+ employee.getIdEmployee() 
		+ " "+employee.getName()
		+ " "+employee.getLastName());
		
		context.close();

	}

}
