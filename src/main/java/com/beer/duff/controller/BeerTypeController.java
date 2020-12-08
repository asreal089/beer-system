package com.beer.duff.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<BeerType> createBeerType(@Valid @RequestBody BeerType beerType, HttpServletResponse response){
		BeerType beerTypeSaved = beerTypeRepository.save(beerType);
		return ResponseEntity.status(HttpStatus.CREATED).body(beerTypeSaved) ;
	}
}
