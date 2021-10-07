package com.hsbc.automobile;

public class SelectVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("KTM Instance");
		Ktm ktm=new Ktm();
		AutomobileUI.printVehicle(ktm);
		System.out.println("------------------");
		System.out.println("Royal Enfield Instance");
		RoyalEnfield rf=new RoyalEnfield();
		AutomobileUI.printVehicle(rf);
		System.out.println("------------------");
		System.out.println("BMW Instance");
		Bmw bmw=new Bmw();
		AutomobileUI.printVehicle(bmw);
		System.out.println("------------------");
		System.out.println("Alto instance");
		Alto alto=new Alto();
		AutomobileUI.printVehicle(alto);
		System.out.println("------------------");
		System.out.println("Skoda Instance");
		Skoda skoda=new Skoda();
		AutomobileUI.printVehicle(skoda);
	}

}
