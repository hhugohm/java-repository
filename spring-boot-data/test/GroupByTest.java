package org.neos.spring.data.jpa.test;


import org.neos.spring.data.jpa.dao.EmployeeDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GroupByTest {
	
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context =
				 new ClassPathXmlApplicationContext("spring-module.xml");
		
		 EmployeeDao dao = (EmployeeDao) context.getBean("registrationBean");
		
		int count= dao.getEmployeeRepository().getNumberGroupByName("H");
		System.out.println("Numero de coincidencias: " + count);
		
		context.close();
		
	}
}
