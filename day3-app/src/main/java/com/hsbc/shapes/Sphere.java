package com.hsbc.shapes;

public class Sphere implements Shape{
	private double radius;

	public Sphere(double radius) {
		this.radius = radius;

	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		double sphereArea=4*3.14*radius*radius;
		System.out.println("Sphere area: "+sphereArea);
	}

}
