package com.hsbc.day4_exercise.service;

import com.hsbc.day4_exercise.beans.Employee;
import com.hsbc.day4_exercise.dao.EmployeeDao;
import com.hsbc.day4_exercise.dao.EmployeeDaoArrayImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao=null;
	public EmployeeServiceImpl()
	{
		dao=new EmployeeDaoArrayImpl();
	}

	@Override
	public void store(Employee employee) {
		// TODO Auto-generated method stub
		dao.save(employee);
		
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		// TODO Auto-generated method stub
		return dao.fetchEmployeeById(id);
	}

	@Override
	public Employee[] findAllEmployees() {
		// TODO Auto-generated method stub
		return dao.findAllEmployees();
	}

	@Override
	public void updateSalary(int id, double salary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateName(int id, String name) {
		// TODO Auto-generated method stub
		
	}
	
}
