package com.beer.duff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beer.duff.model.BeerType;
import com.beer.duff.repository.BeerTypeRepository;

@RestController
@RequestMapping("/beertype")
public class BeerTypeController {
	
	@Autowired
	private BeerTypeRepository beerTypeRepository; 
	
	@GetMapping
	public ResponseEntity<?> getBeerTypes(){
		List<?> beerTypes = beerTypeRepository.findAll();
		return !beerTypes.isEmpty() ? ResponseEntity.ok(beerTypes) : ResponseEntity.noContent().build() ;
	}
}
