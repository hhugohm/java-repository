package org.neos.patterns.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class JdbcEmployeeDAO implements EmployeeDao {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Employee getEmployeeById(int idEmployee) {

		String sql =
	"SELECT ID_EMPLOYEE,NAME,LAST_NAME FROM EMPLOYEES WHERE ID_EMPLOYEE = ?";

		Connection conn = null;
		Employee employee = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idEmployee);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				employee =
							new Employee(rs.getInt("ID_EMPLOYEE"), rs.getString("NAME"), rs.getString("LAST_NAME"));
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
