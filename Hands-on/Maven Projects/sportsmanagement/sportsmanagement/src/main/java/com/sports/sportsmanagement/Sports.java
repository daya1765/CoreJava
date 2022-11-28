package com.sports.sportsmanagement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name = "Sport")
	
	 
	//POJO class
	public class Sports {
	 
	    @Id 
	    @Column(name = "playerid")
	    private int id;
	 
	    @Column(name = "playername")
	    private String playerName;
	 
	    @Column(name = "domain") 
	    private String gameName;

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
			return playerName;
		}

		/**
		 * @param playerName the playerName to set
		 */
		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}

		/**
		 * @return the gameName
		 */
		public String getGameName() {
			return gameName;
		}

		/**
		 * @param gameName the gameName to set
		 */
		public void setGameName(String gameName) {
			this.gameName = gameName;
		}

	    

}
