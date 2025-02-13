package com.app;

public class LibraryApp {

	public static void main(String[] args) {
		// Creates a new Library instance
		Library library = new Library();
		
		// Creates Book instances
		System.out.println("Adding the books");
		Book book1 = new Book("Clean Code", "Robert C. Martin", "978-0135166307", 40.99);
		Book book2 = new Book("Design Patterns", "Erich Gamma", "978-0201633610", 50.99);
		Book book3 = new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059", 45.99);
		
		// Add the books to the Library 
		System.out.println("Adding books");
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		System.out.println("Books added successfully.");
		
		// Search for book by ISBN and display the result
		String searchISBN = "978-0135166307";
		System.out.println("\nSearching for book with ISBN: " + searchISBN);
		Book foundBook = library.searchByISBN(searchISBN);
		if (foundBook != null) {
			System.out.println("Book found: " + foundBook.getTitle() + " by " + foundBook.getAuthor() + " (ISBN: " + foundBook.getISBN() + ", $" + String.format("%.2f", foundBook.getPrice()) + ")");
		}
		else {
			System.out.println("Book not found with ISBN: " + searchISBN);
		}
	}

}
