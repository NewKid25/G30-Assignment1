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

	

}
