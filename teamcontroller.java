package com.tournament.tp.controllers.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.tournament.tp.restteam;
import com.tournament.tp.team;
import com.tournament.tp.game;
import com.tournament.tp.restgame;
import com.tournament.tp.restregion;
import com.tournament.tp.tournaments;
import com.tournament.tp.resttournaments;



@RestController
public class teamcontroller {


	    
	    @Autowired
	    restteam teams;
	    
	    @Autowired
	    restgame games;
	    
	    @Autowired
	    restregion regions;
	    
	    @Autowired 
	    resttournaments tournaments;
	    
	    
	    //team table stuff
		@GetMapping(value = "/1") 
		public String hello() { 
				return "Easter Egg";
		}
		@CrossOrigin(origins = "*")   
		@PostMapping(value = "/Newteam/{Name}/{City}/{State}/{Nickname}/{Logo}")
		public boolean postNewteam(@PathVariable("Name") String name,
				@PathVariable("City")String city, @PathVariable("State")
		        String state, @PathVariable("Nickname") String nickname, @PathVariable("Logo")String logo) {
			boolean buttface = true;
			    teams.postNewteam(name, city, state, nickname, logo);
			    return buttface;
		}
		@CrossOrigin(origins = "*")
		@PostMapping(value = "/CheckOn")
		@ResponseStatus
		public team Post(@RequestParam("Name") String Name, @RequestParam("City") String City,
		    @RequestParam("State")String State, @RequestParam("Nickname")String Nickname,
		@RequestParam("Logo")String Logo) {
		  
		            
		            team ThisTeam = new team(Name, City, State, Nickname, Logo);
		            teams.save(ThisTeam);
		                return ThisTeam;	                                        

	}
		@CrossOrigin(origins = "*")
		@PutMapping(value = "/updateteam/{Name}/{City}/{State}/{Nickname}/{Logo}/{id}")
		public boolean updateByName(@PathVariable("Name") String name, @PathVariable("City") String city, @PathVariable("State")
		String state, @PathVariable("Nickname") String nickname, @PathVariable("Logo") String logo, @PathVariable("id") int id) {
	        boolean yes = true;
	        teams.updateByName(name, city, state, nickname, logo, id);
	        return yes;
	    }
		
@CrossOrigin(origins = "*")
@GetMapping(value = "/team/{Name}")
public List<team> newMethod(@PathVariable String Name) {
	return teams.findByName(Name);
}

@CrossOrigin(origins = "*")
@GetMapping(value = "/team/count/") 
public Long Count() { 
	long numberOnuts = teams.count();

		 
		return numberOnuts;
}

@CrossOrigin(origins = "*")
@GetMapping(value = "/team") 
public Iterable<team> findAll() {
	return teams.findAll();
}
@CrossOrigin(origins = "*")
@GetMapping(value = "/teamTourney/{tourneyid}")
public List<team> tourneyTeams(@PathVariable int tourneyid){
	return teams.tourneyTeams(tourneyid);
}

@CrossOrigin(origins = "*")
@GetMapping(value = "/teamgame/{gametourneyorder}")
public List<team> tourneytwoteams(@PathVariable int gametourneyorder){
	return teams.tourneytwoteams(gametourneyorder);
}
@CrossOrigin(origins = "*")
@GetMapping(value = "/selectteam1/{gameid}")
public List<String> selectteam(@PathVariable int gameid){
	return teams.selectteam1(gameid);
}
@CrossOrigin(origins = "*")
@GetMapping(value = "/selectteam2/{gameid}")
public List<String> selectteam2(@PathVariable int gameid){
	return teams.selectteam2(gameid);
}


//game table stuff >>
@CrossOrigin(origins = "*")
@GetMapping(value  = "/game/{tourneyid}")
public List<game> tourneyGames(@PathVariable int tourneyid) {
	return games.tourneyGames(tourneyid);
}


//tournaments table stuff>>
@CrossOrigin(origins = "*")
@GetMapping(value = "/tourneychamp/")
public Iterable<tournaments> findAll1() {
	return tournaments.findAll();
}
}
