package com.cg.mri.beans;

public class Account {
	

	private String account_type,customer_name;
	private double account_amount;
	public Account(String string, String string2, int i) {
		this.account_type=string;
		this.customer_name=string2;
		this.account_amount=i;
	}
	public Account() {
		
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public double getAccount_amount() {
		return account_amount;
	}
	public void setAccount_amount(double account_amount) {
		this.account_amount = account_amount;
	}
}
