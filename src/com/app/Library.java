package com.app;

public class Library {
  	private Book[] books;
	private int count;

	public Library() {
		books = new Book[5];
		count = 0;
	}
	
	/**
	 * This method will add a book to the library if there is space
	 * @param book
	 * This argument hold the value of the book to be added
	 * 
	 * @return
	 * Return true if the book was successfully added. Return false if the book was not added
	 */
	public boolean addBook(Book book) {
		for(int i = 0; i < books.length; i++) {
			if(books[i] == null) {
				books[i] = book;
				count++;
				return true;
			}

		}
		System.out.println("You cannot add anymore books");
		return false;
	}
	
	/**
	 * This method takes a book, checks the library for the book, and removes the book if it exists
	 * @param book
	 * This is the book to be removed
	 * @return
	 * Return true if the book was removed. Return false if the book was not removed
	 */
	public boolean removeBook(Book book) {
		for(int i = 0; i < books.length; i++) {
			if(book != null && books[i].equals(book)) {
				books[i] = null;
				count--;
				System.out.println("The book, "+ book +", was succefully removed");
				return true;
			} 
			
		}
		System.out.println("The book, "+ book +", could not be removed");
		return false;
	}

	/**
	 * This method takes ISBN and searches the library for that ISBN
	 * @param ISBN
	 * this is the ISBN the method looks for
	 * @return
	 * returns the book with the matching ISBN if it matches, returns null if the ISBN does not match
	 */
	public Book seacrhByISBN(String ISBN) {
		for(int i = 0; i < books.length; i++) {
			if(books[i] != null && books[i].equals(ISBN)) {
				return books[i];
			}
		}
		System.out.println("The book you are trying to find was not found");
		return null;
	}

	

}
