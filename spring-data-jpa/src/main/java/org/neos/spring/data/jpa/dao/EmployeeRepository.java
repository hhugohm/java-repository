package org.neos.spring.data.jpa.dao;

import java.util.List;


import org.neos.spring.data.jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author Hector Hugo Midalgo
 * 27/09/2015
 * This clase has the Employee Repository
 *
 */
@Repository
@Transactional(readOnly=true)
public interface EmployeeRepository extends  JpaRepository<Employee, Integer>{

	public Employee findByidEmployee(int id);
	
	@SuppressWarnings("el-syntax")
	@Query("SELECT e FROM #{#entityName} e WHERE e.name = ?")
	public List<Employee> findByname(String name);
	
	
	@Query("SELECT e FROM Employee e WHERE e.name  LIKE CONCAT('%',:name,'%') ORDER BY e.name")
	public List<Employee> findByEmployeeWithPartOfName(@Param("name") String name);
	
	@Modifying
	@Transactional(timeout = 10)
	@Query("UPDATE Employee e set e.name = ?1, e.lastName = ?2 where e.idEmployee = ?3")
	public void setEmployeeInfoById(String name, String lastName, Integer idEmployee);
	
	@Query(value = "SELECT count(*)  FROM EMPLOYEES e WHERE e.name LIKE CONCAT('%',:name,'%') GROUP BY e.name", nativeQuery = true)
	public int getNumberGroupByName(@Param("name")String name);
	

}
