package com.hsbc.entity;

public class Current extends Account{
	private String nomineeName;
	public Current(int accountNumber,double balance,String ifsc,String nomineeName)
	{
		super(accountNumber,balance,ifsc);
		this.nomineeName=nomineeName;
	}
	@Override
	public String toString() {
		return "Current [nomineeName=" + nomineeName + ", getNomineeName()=" + getNomineeName()
				+ ", getAccountNumber()=" + getAccountNumber() + ", getBalance()=" + getBalance() + ", getIfsc()="
				+ getIfsc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
}
