package model.dao;

import model.entities.Employee;

public interface EmployeeDao {
	
	void insert(Employee obj);
	void update(Employee obj);
	void deleteById(Employee id);
	Employee findById(Integer id);
}
