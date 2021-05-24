package com.javaeight.examples.model;

public class AccountDetail {

	private String creditCardNumber;
	private String cvv;
	private String exp;
	
	
	
	public AccountDetail(String creditCardNumber, String cvv, String exp) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.cvv = cvv;
		this.exp = exp;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	
	
}
