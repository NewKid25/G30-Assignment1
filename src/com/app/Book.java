package com.app;

public class Book {

	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	public Book()
	{
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}

	public Book(String title, String author, String ISBN, double price) 
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	public Book(Book book)
	{
		this(book.title, book.author, book.ISBN, book.price);
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

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return title +" by "+author+", ISBN: "+ISBN+", Price: $"+Double.toString(price);
	}
	
	public boolean equals(Book other)
	{
		if(other.ISBN == this.ISBN)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
