package com.beer.duff.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.beer.duff.model.BeerType;


public interface BeerTypeRepository extends JpaRepository<BeerType, Long> {
	
}

