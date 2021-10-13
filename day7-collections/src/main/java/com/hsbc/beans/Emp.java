package com.hsbc.beans;

public class Emp {
	private String name;
	private Gender gender;
	private Department department;
	public Emp(String name, Gender gender, Department department) {
		super();
		this.name = name;
		this.gender = gender;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", gender=" + gender + ", department=" + department + "]";
	}

}