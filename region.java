package com.tournament.tp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class region {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String region;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		region = region;
	}

}
