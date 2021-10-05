package com.example;
import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character: ");
		char s=sc.next().charAt(0);
		checkAlphabet(s);

	}
	public static void checkAlphabet(char c)
	{
		if((c>=97 && c<=122)||(c>=65 && c<=90))
		{
			System.out.println("It is an alphabet");
		}
		else
		{
			System.out.println("Not an alphabet");
		}
	}

}
