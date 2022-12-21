package com.library.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name="Student_Information")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	
	@Column(name="student_name")
	private String name;
	
	@Column(name="phone_no")
	private int phone;
	
	@Column(name="emailId")
	private String email;
	
	@Column(name="student_branch")
	private String branch;
	
	@Column(name="student_year")
	private int year;
	
	@OneToMany(mappedBy="student")
	private List<Book>  books= new ArrayList<>();

	@Builder
	public Student(String name, int phone, String email, String branch, int year) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.branch = branch;
		this.year = year;
	}

	
	
	

}
