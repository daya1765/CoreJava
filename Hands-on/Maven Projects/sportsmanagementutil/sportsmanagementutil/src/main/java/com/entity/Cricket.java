package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cricket")
public class Cricket {
	//variables
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="player_name")
    private String PlayerName;
    
    @Column(name="hobby")
    private String hobby;

 

    @Column(name="inspiration")
    private String inspiration;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cricket_detail_id")
    private CricketDetail cricketDetail;
    
    //default constructor
    public Cricket() {
        
    }

 
    //parameterized constructor
    public Cricket(String PlayerName, String hobby, String inspiration) {
        this.PlayerName = PlayerName;
        this.hobby = hobby;
        this.inspiration = inspiration ;
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
	 * @return the playerName
	 */
	public String getPlayerName() {
		return PlayerName;
	}


	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}


	/**
	 * @return the hobby
	 */
	public String getHobby() {
		return hobby;
	}


	/**
	 * @param hobby the hobby to set
	 */
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	/**
	 * @return the inspiration
	 */
	public String getInspiration() {
		return inspiration;
	}


	/**
	 * @param inspiration the inspiration to set
	 */
	public void setInspiration(String inspiration) {
		this.inspiration = inspiration;
	}


	/**
	 * @return the cricketDetail
	 */
	public CricketDetail getCricketDetail() {
		return cricketDetail;
	}


	/**
	 * @param cricketDetail the cricketDetail to set
	 */
	public void setCricketDetail(CricketDetail cricketDetail) {
		this.cricketDetail = cricketDetail;
	}


}
