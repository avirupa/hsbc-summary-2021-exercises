package com.hsbc.day4_exercise.dao;

import com.hsbc.day4_exercise.beans.Employee;

public class EmployeeDaoArrayImpl implements EmployeeDao {
	private static Employee[] employeeDb=new Employee[10];
	private static int arrayIndexCounter=0;
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeDb[arrayIndexCounter]=employee;
		arrayIndexCounter++;	
		
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee[] tempDb=new Employee[arrayIndexCounter];
		for(Employee emp:employeeDb)
		{
			if(emp.getId()==id)
			{
				return emp;
			}
		}
		return null;
	}

	@Override
	public Employee[] findAllEmployees() {
		// TODO Auto-generated method stub
		Employee[] tempDb=new Employee[arrayIndexCounter];
		for(int index=0;index<arrayIndexCounter;index++)
		{
			tempDb[index]=employeeDb[index];
		}
		return tempDb;
	}

	@Override
	public void UpdateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		Employee[] tempDb=new Employee[arrayIndexCounter];
		for(Employee emp:employeeDb)
		{
			if(emp.getId()==id)
			{
				tempDb
			}
		}
		
	}

}
