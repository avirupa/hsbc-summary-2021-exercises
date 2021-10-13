package com.hsbc.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestEmployeeMap {
	public static void main(String[] args) {
		List<Employee> accountsEmployee = new ArrayList<Employee>();
		List<Employee> salesEmployee = new ArrayList<Employee>();
		// employees whose department is accounts
		accountsEmployee.add(new Employee(100, "Alex", 25000, "Accounts"));
		accountsEmployee.add(new Employee(200, "Bruce", 35000, "Accounts"));
		// employees whose department is sales
		salesEmployee.add(new Employee(400, "Alex", 35000, "Sales"));
		salesEmployee.add(new Employee(500, "Bruce", 45000, "Sales"));
		
		Map<String, List<Employee>> employeeMap = new HashMap<String, List<Employee>>();
		employeeMap.put("ACCOUNT", accountsEmployee);
		employeeMap.put("SALES", salesEmployee);
		List<Employee> emps = employeeMap.get("SALES");
		for(Employee e : emps) {
			System.out.println(e);
		}
		
	}
}