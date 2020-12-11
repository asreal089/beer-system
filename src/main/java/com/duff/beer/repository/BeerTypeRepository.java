package com.duff.beer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duff.beer.model.BeerType;
import com.duff.beer.repository.beertype.BeerTypeQuery;


public interface BeerTypeRepository extends JpaRepository<BeerType, Long>, BeerTypeQuery {
	
}

