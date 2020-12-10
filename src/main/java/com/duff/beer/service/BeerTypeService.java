package com.duff.beer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.duff.beer.model.BeerType;
import com.duff.beer.repository.BeerTypeRepository;

@Service
public class BeerTypeService {
	
	@Autowired
	BeerTypeRepository beerTypeRepository;

	public Optional<BeerType> updateBeerType(Long id, BeerType beerType){
		Optional<BeerType> beerTypeSaved = getBeerTypeById(id);
		beerType.setId(id);
		beerTypeRepository.save(beerType);
		return beerTypeSaved;
	}
	
	public Optional<BeerType> getBeerTypeById(Long id){
		Optional<BeerType> beerTypeSaved = beerTypeRepository.findById(id);
		if(beerTypeSaved.isEmpty()) {
			throw new EmptyResultDataAccessException(1);
		}
		return beerTypeSaved;
	}
}
