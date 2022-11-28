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
@Table(name="cricket_detail")
public class CricketDetail {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    //variables
    @Column(name="id")
    private int id;
    
    @Column(name="cricket_stadium")
    private String cricket_stadium;
    
    @Column(name="cricket_types")
    private String cricket_types;
    
    @OneToOne(mappedBy="cricketDetail", cascade=CascadeType.ALL)
    private Cricket cricket;
    
    //default constructor
    public CricketDetail() {
        
    }

 
    //Parameterized Constructor
    public CricketDetail(String cricket_stadium, String cricket_types) {
        this.cricket_stadium = cricket_stadium;
        this.cricket_types =cricket_types;
    }


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the cricket_stadium
	 */
	public String getCricket_stadium() {
		return cricket_stadium;
	}


	/**
	 * @param cricket_stadium the cricket_stadium to set
	 */
	public void setCricket_stadium(String cricket_stadium) {
		this.cricket_stadium = cricket_stadium;
	}


	/**
	 * @return the cricket_types
	 */
	public String getCricket_types() {
		return cricket_types;
	}


	/**
	 * @param cricket_types the cricket_types to set
	 */
	public void setCricket_types(String cricket_types) {
		this.cricket_types = cricket_types;
	}


	/**
	 * @return the cricket
	 */
	public Cricket getCricket() {
		return cricket;
	}


	/**
	 * @param cricket the cricket to set
	 */
	public void setCricket(Cricket cricket) {
		this.cricket = cricket;
	}


	


}
