package com.tournament.tp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class tournaments {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String team;
	int year;
	String logo;
	String name;
	String trophy;
	
	public String getTrophy() {
		return trophy;
	}
	public void setTrophy(String trophy) {
		this.trophy = trophy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}

}
