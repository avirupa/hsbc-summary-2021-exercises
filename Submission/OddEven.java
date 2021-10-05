package com.example;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range: ");
		int s1=sc.nextInt();
		System.out.println("Enter the ending range: ");
		int s2=sc.nextInt();
		printEven(s1,s2);
		printOdd(s1,s2);

	}
	public static void printEven(int a,int b)
	{
		System.out.println("Even numbers: ");
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}
	}
	public static void printOdd(int a,int b)
	{
		System.out.println("Odd numbers: ");
		for(int i=a;i<=b;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+" ");
			}
		}
	}
	

}
