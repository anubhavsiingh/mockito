package com.coforge.training.mockitodemo;

public class Person {
	
	private String name;
	private String Address;
	private Integer noOfBooks;
	
	public Person(String name, String address, Integer noOfBooks) {
		super();
		this.name = name;
		Address = address;
		this.noOfBooks = noOfBooks;
	}

	public String getName() {
		System.out.println(name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Integer getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(Integer noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	
	
	

}
