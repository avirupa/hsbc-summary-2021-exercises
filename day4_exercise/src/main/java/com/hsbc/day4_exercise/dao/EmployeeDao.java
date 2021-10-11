package com.hsbc.day4_exercise.dao;

import com.hsbc.day4_exercise.beans.Employee;

public interface EmployeeDao {
	public void save(Employee employee);
	public Employee fetchEmployeeById(int id);
	public Employee[] findAllEmployees();
	public void UpdateEmployee(int id, Employee employee);
}
