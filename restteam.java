package com.tournament.tp;
import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;


@RepositoryRestResource
public interface restteam extends CrudRepository <team, Integer> {

	
    @Modifying
    @Transactional
    @Query(value = "insert into team (Name, City, State, Nickname, Logo)"
            + " values (:newName, :newCity, :newState,"
            + " :newNickname, :newLogo)", nativeQuery =true)
           void postNewteam(String newName, String newCity,String newState, String newNickname, String newLogo);

	List<team> findByName(String name);
	

	@Query(value = "select * from team where id in (select Team1 from game where Tourneyid = :Tourneyid)\r\n" + 
                   "                      or id in (select Team2 from game where Tourneyid = :Tourneyid)", nativeQuery = true)
	List <team> tourneyTeams(@Param("Tourneyid") int tourneyid);

	
	@Query(value = "select * from team where id in (select Team1 from game where game.tourneyorder  = :gametourneyorder)\r\n" + 
			       "                      or id in (select Team2 from game where game.tourneyorder  = :gametourneyorder)", nativeQuery = true)
    List <team> tourneytwoteams(@Param("gametourneyorder") int gametourneyorder);

    
  @Query(value = "select name from team where id in (select team1 from game where game.id = :gameid)", nativeQuery =true)
    List <String> selectteam1(@Param("gameid") int gameid);
    
    @Query(value = "select name from team where id in (select team2 from game where game.id = :gameid)", nativeQuery =true)
   List <String> selectteam2(@Param("gameid") int tourneyorder);

	@Modifying
	@Transactional
	@Query(value = "update team set name = :newName, City = :newCity, State = :newState, Nickname = :newNickname, Logo = :newLogo where id = :updateid", nativeQuery = true)
	void updateByName(String newName, String newCity, String newState, String newNickname, String newLogo, int updateid);
    
	
    
}