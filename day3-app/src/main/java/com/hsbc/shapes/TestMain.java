package com.hsbc.shapes;
import java.util.Scanner;

public class TestMain {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the radius: ");
	 double r=sc.nextDouble();
	 Circle circle=new Circle(r);
	 FindArea.displyArea(circle);
	 System.out.println("---------------------");
	 Sphere sphere=new Sphere(r);
	 FindArea.displyArea(sphere);
 }
}
