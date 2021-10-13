package com.hsbc.beans;

public class TestEnums {
	public static void main(String[] args) {
		Gender gender = Gender.MALE;
		System.out.println("Gender = "+gender);
		gender = Gender.FEMALE;
		System.out.println("Gender = "+gender);
		// Employee emp = new Employee(101, "Raj", 52000, Department.SALES)
	}
}