package com.book;

public class Book {
	
	private String bookName;
	private String bookId;
	private String bookAuthor;
	private static String bookLibraryName= "Anudip Library";
	private float bookPrice;
	private boolean availability;
	
	public void createBook(String bookName, String bookId, String bookAuthor,float bookPrice, boolean availabile ) {
		this.bookName=bookName;
		this.bookId=bookId;
		this.bookAuthor=bookAuthor;
		this.bookPrice=bookPrice;
		this.availability=availabile;
		
		
		
		
	}
	
	public void displayBook() {
	
	        System.out.println("Book Name: " + bookName);
	  	    System.out.println("Book ID: " + bookId);
	        System.out.println("Book Price: " + bookPrice);
	        System.out.println("Author Name: " + bookAuthor);
	        System.out.println("Library Name: " + bookLibraryName);
	        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
	        System.out.print("\n");
		
	}
	
	  public void displayBookByName(String name) {
	        if (bookName.equals(name)) {
	        	System.out.println("Book found having details: ");
	            displayBook();
	        } else {
	            System.out.println("Book not found!");
	        }
	    }

	    public void borrowBook(String name) {
	        if (bookName.equals(name)) {
	            if (availability) {
	                availability = false;
	                System.out.println("Book borrowed successfully!");
	            } 
	            else {
	                System.out.println("Book not available for borrowing!");
	            }
	        }
	        else {
	            System.out.println("Book not found!");
	        }
	    }


   
	
	

}
