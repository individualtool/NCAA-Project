package com.tournament.tp;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public
interface restgame extends CrudRepository <game, Integer> {
	
	@Query(value = "select * from game  where Tourneyid = :Tourneyid", nativeQuery = true)
	List <game> tourneyGames(@Param("Tourneyid") int tourneyid);
}
