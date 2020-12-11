package com.duff.beer.repository.beertype;

import java.util.List;

import com.duff.beer.model.BeerType;
import com.duff.beer.repository.filter.BeerTemperature;



public interface BeerTypeQuery {
	public List<BeerType> filtrar(BeerTemperature temperature);
}
