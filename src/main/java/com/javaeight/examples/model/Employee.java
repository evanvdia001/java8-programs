package com.javaeight.examples.model;

public class Employee {
	
	private String empID;
	private String firstName;
	private String lastName;
	private String age;
	private String title;
	private Address address;
	private AccountDetail account;
	
	
	
	public Employee() {
		
	}
	public Employee(String empID, String firstName, String lastName, String age, String title, Address address,
			AccountDetail account) {
		super();
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.title = title;
		this.address = address;
		this.account = account;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public AccountDetail getAccount() {
		return account;
	}
	public void setAccount(AccountDetail account) {
		this.account = account;
	}
	
	

}
