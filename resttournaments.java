package com.tournament.tp;


import org.springframework.data.repository.CrudRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public
interface resttournaments extends CrudRepository <tournaments, Integer> {

}
