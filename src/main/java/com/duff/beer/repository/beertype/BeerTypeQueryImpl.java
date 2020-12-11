package com.duff.beer.repository.beertype;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.duff.beer.model.BeerType;
import com.duff.beer.repository.filter.BeerTemperature;

public class BeerTypeQueryImpl implements BeerTypeQuery {
	
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<BeerType> filtrar(BeerTemperature temperature) {
		String sql = "SELECT * FROM  cerveja_tipo ct where ("+temperature.getTemperature()+" BETWEEN temperatura_max  AND temperatura_min) order BY   ABS ((temperatura_max + temperatura_min )/2 -("+temperature.getTemperature()+") ) ASC LIMIT  1; ";
		return entityManager.createNativeQuery(sql, BeerType.class).getResultList();
	}

}
