package com.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Book_details")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="book_title")
	private String bookTitle;
	
	@Column(name="book_author")
	private String bookAuthor;
	
	@Column(name="book_publication")
	private String bookPublication;
	
	@Column(name="book_category")
	private String bookCategory;
	
	@Column(name="book_price")
	private int  price;
	
	
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private  Student student;

    @Builder
	public Book(String bookTitle, String bookAuthor, String bookPublication, String bookCategory, int price) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublication = bookPublication;
		this.bookCategory = bookCategory;
		this.price = price;
		
	}
	
	
	
	 

}
