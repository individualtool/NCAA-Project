package com.tournament.tp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class game {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;
	int tourneyid;
	String team1;
	String team2;
	int seed1;
	int seed2;
	int round;
	String region;
	int score1;
	int score2;
	int tourneyorder;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTourneyid() {
		return tourneyid;
	}
	public void setTourneyid(int tourneyid) {
		tourneyid = tourneyid;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		team2 = team2;
	}
	public int getSeed1() {
		return seed1;
	}
	public void setSeed1(int seed1) {
		seed1 = seed1;
	}
	public int getSeed2() {
		return seed2;
	}
	public void setSeed2(int seed2) {
		seed2 = seed2;
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		round = round;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		region = region;
	}
	public int getScore1() {
		return score1;
	}
	public void setScore1(int score1) {
		score1 = score1;
	}
	public int getScore2() {
		return score2;
	}
	public void setScore2(int score2) {
		score2 = score2;
	}

}
