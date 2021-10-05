package com.example;

public class CommadLineArg {
	public static void main(String[] args)
	{
		System.out.println("Iterating through command line input");
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		System.out.println("Argument are: ");
		for(String s:args) {
			System.out.println(s);
		}
	}
}
