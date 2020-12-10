package com.duff.beer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duff.beer.model.BeerType;


public interface BeerTypeRepository extends JpaRepository<BeerType, Long> {
	
}

