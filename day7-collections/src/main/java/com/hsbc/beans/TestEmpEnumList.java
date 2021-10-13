package com.hsbc.beans;

import java.util.ArrayList;
import java.util.List;

public class TestEmpEnumList {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp("Alex", Gender.MALE, Department.OPERATION));
		list.add(new Emp("Katy", Gender.FEMALE, Department.FINANCE));
		
		for(Emp e : list) {
			System.out.println(e);
		}
	}
}