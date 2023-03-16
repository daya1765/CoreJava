package com.book;

public class BookManagementSystem {
	
	public static void main(String[] args) {
		Book book1=new Book();
		book1.createBook("Java", "Jb100","Srinivasan", 345, true);
		Book book2=new Book();
		book2.createBook("Python","Py101","Panda", 395, true);
		
		Book book3=new Book();
		book3.createBook("Database", "Data121", "Jeera", 645, true);
		
		Book book4=new Book();
		book4.createBook("Mathematics", "M1215", "S Panda", 450, true);
		
		Book book5=new Book();
		book5.createBook("C language", "CL199", "A Sinha", 295,false);
		
		//display all books
		
		book1.displayBook();
		book2.displayBook();
		book3.displayBook();
		book4.displayBook();
		book5.displayBook();
		
		//dispaly books by name
		
		book2.displayBookByName("Physics");
		book4.displayBookByName("Mathematics");
		
		System.out.println("\n");
		
		//borrow books
		
		System.out.println("Borrow Book: ");
	    book1.borrowBook("Java");
	    book1.displayBook();
	}

}
