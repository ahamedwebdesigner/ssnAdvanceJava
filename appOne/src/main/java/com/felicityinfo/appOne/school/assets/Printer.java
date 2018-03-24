package com.felicityinfo.appOne.school.assets;

public class Printer {
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public void printBook() {
		System.out.println(this.book);
	}
	

}
