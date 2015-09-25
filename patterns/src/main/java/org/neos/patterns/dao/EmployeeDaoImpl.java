package org.neos.patterns.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private DataSource dataSource;


	public Employee getEmployeeById(int idEmployee) {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ID_EMPLOYEE,NAME,LAST_NAME ");
		sql.append("FROM EMPLOYEES "); 
		sql.append("WHERE ID_EMPLOYEE = ? ");
		System.out.println(sql);

		Connection conn = null;
		Employee employee = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql.toString());
			
			ps.setInt(1, idEmployee);

			ResultSet rs = ps.executeQuery();
			if(rs.first()){
				employee = new Employee();
				employee.setIdEmployee(rs.getInt("ID_EMPLOYEE"));
				employee.setName(rs.getString("NAME"));
				employee.setLastName(rs.getString("LAST_NAME"));
			}
			
			rs.close();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

		return employee;
	}

}
