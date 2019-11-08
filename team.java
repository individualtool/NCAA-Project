package com.tournament.tp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class team {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 int Id;
	 String name;
	 String city;
	 String state;
	 String nickname;
	 String logo;
	 
	 
	 public team(String Name, String City, String State, String Nickname, String Logo) {
		 
		 this.name = Name;
		 this.city = City;
		 this.state = State;
		 this.nickname = Nickname;
		 this.logo = Logo;
		 
		
	}
	 
	public team() {
		super();
		// this.name = name;
		// this.city = city;
		// this.state = state;
	    //this.nickname = nickname;
		// this.logo = logo;
		
		
	}


	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		state = state;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		nickname = nickname;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		logo = logo;
	}

}
