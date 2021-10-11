package com.hsbc.day4_exercise.service;

import com.hsbc.day4_exercise.beans.Employee;

public interface EmployeeService {
	public void store(Employee employee);
	public Employee fetchEmployeeById(int id);
	public Employee[] findAllEmployees();
	public void updateSalary(int id, double salary);
	public void updateName(int id,String name);
}
