package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student_detail")
public class StudentDetail {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    //variables
    @Column(name="id")
    private int id;
    
    @Column(name="youtube_channel")
    private String youtubeChannel;
    
    @Column(name="hobby")
    private String hobby;
    
    @OneToOne(mappedBy="studentDetail", cascade=CascadeType.ALL)
    private Student student;
    
    

	public StudentDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDetail(String youtubeChannel, String hobby) {
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
    
    

}
