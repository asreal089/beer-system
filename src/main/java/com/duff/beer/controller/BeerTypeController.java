package com.duff.beer.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.duff.beer.model.BeerType;
import com.duff.beer.repository.BeerTypeRepository;
import com.duff.beer.service.BeerTypeService;

@RestController
@RequestMapping("/beertype")
public class BeerTypeController {
	
	@Autowired
	private BeerTypeRepository beerTypeRepository;
	
	@Autowired
	private BeerTypeService beerTypeService;
	
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
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removerPessoa(@PathVariable Long id) {
		beerTypeRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?>  atualizaPessoa(@PathVariable Long id, @Valid @RequestBody BeerType beerType){
		Optional<BeerType> beerTypeSaved = beerTypeService.updateBeerType(id, beerType);
		return ResponseEntity.ok(beerTypeSaved);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?>  getBeerTypeById(@PathVariable Long id){
		Optional<BeerType> beerTypeSaved = beerTypeService.getBeerTypeById(id);
		return ResponseEntity.ok(beerTypeSaved);
	}
}
