package com.hsbc.entity;

public class Savings extends Account {
	private double dailyLimit;
	public Savings(int accountNumber,double balance,String ifsc,double dailyLimit)
	{
		super(accountNumber,balance,ifsc);
		this.dailyLimit=dailyLimit;
	}
	
	@Override
	public String toString() {
		return "Savings [dailyLimit=" + dailyLimit + ", getDailyLimit()=" + getDailyLimit() + ", getAccountNumber()="
				+ getAccountNumber() + ", getBalance()=" + getBalance() + ", getIfsc()=" + getIfsc() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public double getDailyLimit() {
		return dailyLimit;
	}
	public void setDailyLimit(double dailyLimit) {
		this.dailyLimit = dailyLimit;
	}
	
}
