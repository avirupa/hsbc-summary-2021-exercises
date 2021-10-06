package com.hsbc.BankAccount;

import com.hsbc.entity.Account;
import com.hsbc.entity.Current;
import com.hsbc.entity.Savings;

public class App 
{
    public static void main( String[] args )
    {
       
       Savings s=new Savings(321,16000.23,"ABC",2000.54);
       Current c=new Current(678,7200,"XYZ","Avirupa");
       System.out.println("Displaying details of Savings Account: ");
       System.out.println(s);
       System.out.println("-------------------");
       System.out.println("Displaying details of Current Account: ");
       System.out.println(c);
       
       
    }
    
}
