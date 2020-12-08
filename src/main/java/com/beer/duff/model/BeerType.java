package com.beer.duff.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="cerveja_tipo")
public class BeerType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo")
	private Long id;
	
	@NotNull
	@Size(min= 3, max=50)
	@Column(name="tipo")
	private String beerStyle;
	
	@NotNull
	@Column(name="temperatura_max")
	private int maxTemperature;
	
	@NotNull
	@Column(name="temperatura_min")
	private int minTemperature;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBeerStyle() {
		return beerStyle;
	}

	public void setBeerStyle(String beerStyle) {
		this.beerStyle = beerStyle;
	}

	public int getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(int maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	public int getMinTemperature() {
		return minTemperature;
	}

	public void setMinTemperature(int minTemperature) {
		this.minTemperature = minTemperature;
	}

	
	
	

}
