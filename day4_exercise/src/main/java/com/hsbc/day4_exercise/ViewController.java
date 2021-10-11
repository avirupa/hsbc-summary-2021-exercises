package com.hsbc.day4_exercise;

import java.util.Scanner;

import com.hsbc.day4_exercise.beans.Employee;
import com.hsbc.day4_exercise.service.EmployeeService;
import com.hsbc.day4_exercise.service.EmployeeServiceImpl;
import com.mysql.cj.x.protobuf.MysqlxCursor.Open;

public class ViewController {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		EmployeeService service=new EmployeeServiceImpl();
		int controllerOption=0;
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. Store employee 2. Fetch employee by id "
					+ "3. Find all employees 4.Update name 5. Update salary 6. Exit");
			controllerOption=sc.nextInt();
			switch(controllerOption) {
			case 1: 
				System.out.println("----Enter employee details----");
				Employee emp=new Employee();
				System.out.println("Enter the ID: ");
				emp.setId(sc.nextInt());
				System.out.println("Enter the Name: ");
				emp.setName(sc.next());
				System.out.println("Enter the salary: ");
				emp.setSalary(sc.nextDouble());
				service.store(emp);
				System.out.println("Successfully stored");
				System.out.println("----------------------------");
				break;
			case 2: 
				System.out.println("Enter the ID: ");
				int id=sc.nextInt();
				Employee fetch=service.fetchEmployeeById(id);
				System.out.println(fetch);
				break;
			case 3:
				Employee[] employees=service.findAllEmployees();
				for(Employee e: employees)
				{
					System.out.println("Hello "+e.getName()+", your ID is- "+e.getId()+" and your salary is "+e.getSalary());
					System.out.println("------------------");
				}
				break;
			case 4: 
				break;
			case 5: 
				break;
			
			}
		}while(controllerOption!=0);
			sc.close();
	}
}
