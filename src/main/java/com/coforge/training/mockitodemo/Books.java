package com.coforge.training.mockitodemo;

public class Books {
	
	private Integer id;
	private String author;

	public Books(Integer id, String author) {
		super();
		this.id = id;
		this.author = author;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
