package com.felicityinfo.appOne.school.assets;

public class Book {
	private String title;
	private String author;
	
	
	
	
	public Book() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "The printed Book is [title=" + title + ", author=" + author + "]";
	}
	

}
