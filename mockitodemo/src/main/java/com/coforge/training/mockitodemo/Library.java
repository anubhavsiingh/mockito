package com.coforge.training.mockitodemo;

public class Library {
	
	Person person;
	Books book;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}

	public String bookIssuedTo( ) {
		person = new Person("Rahul","GZB",2);
		book = new Books(10,"How I Met Your Mother");
		person.getName();
		book.getAuthor();
		System.out.println(person.getName()+" Issued : "+book.getAuthor());
		return person.getName();
	}
	
	
	
	/*public static void main(String [] args) {
	
	Library lib = new Library();
	lib.bookIssuedTo();
		
	}*/
}
