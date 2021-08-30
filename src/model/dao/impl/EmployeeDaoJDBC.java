package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;
import model.dao.EmployeeDao;
import model.entities.Employee;

public class EmployeeDaoJDBC implements EmployeeDao{

	private Connection conn;
	
	public EmployeeDaoJDBC(Connection conn) {
		this.conn = conn;
	}
		
	@Override
	public void insert(Employee obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO employee"
					+ "(nome, senha, email, nameMother, nameFather) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					+ Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, obj.getName());
			st.setString(2, obj.getPassword());
			st.setString(3, obj.getEmail());
			st.setString(4, obj.getNameMother());
			st.setString(5, obj.getNameFather());
			
			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			}
			else {
				throw new DbException("Unexpected error! No rows affected!");
			}
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public void update(Employee obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Employee id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
