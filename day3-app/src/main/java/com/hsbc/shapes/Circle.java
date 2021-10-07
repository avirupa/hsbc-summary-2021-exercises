package com.hsbc.shapes;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		double areaCircle=3.14*radius*radius;
		System.out.println("Area of the circle: "+areaCircle);
	}

}
