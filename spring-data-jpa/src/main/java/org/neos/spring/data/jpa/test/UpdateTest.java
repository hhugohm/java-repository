package org.neos.spring.data.jpa.test;

import org.neos.spring.data.jpa.dao.EmployeeDao;
import org.neos.spring.data.jpa.entity.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdateTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				 new ClassPathXmlApplicationContext("spring-module.xml");
		
		 EmployeeDao dao = (EmployeeDao) context.getBean("registrationBean");
		
		 //es necesario buscar y despues salvar para que realice el update
		Employee employee= dao.getEmployeeRepository().findOne(1);
		System.out.println("Employee: "+ employee.getIdEmployee() 
		+ " "+employee.getName()
		+ " "+employee.getLastName());
		 
		//se realiza el cambio
		employee.setLastName("HIDALGO");
		dao.getEmployeeRepository().save(employee);
		 
		 context.close();

	}

}
