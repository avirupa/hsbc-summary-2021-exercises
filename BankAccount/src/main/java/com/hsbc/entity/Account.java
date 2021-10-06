package com.hsbc.entity;

public class Account {
	private int accountNumber;
	private double balance;
	private String ifsc;
	private double dailyLimit;
	public Account(int accountNumber,double balance,String ifsc)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.ifsc=ifsc;
		this.dailyLimit=dailyLimit;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public double getDailyLimit() {
		return dailyLimit;
	}
	public void setDailyLimit(double dailyLimit) {
		this.dailyLimit = dailyLimit;
	}
	
}