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
	private Long codigo;
	
	@NotNull
	@Size(min= 3, max=50)
	private String tipo;
	
	@NotNull
	@Column(name="temperatura_max")
	private int temperaturaMax;
	
	@NotNull
	@Column(name="temperatura_min")
	private int temperaturaMin;
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTemperaturaMax() {
		return temperaturaMax;
	}

	public void setTemperaturaMax(int temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}

	public int getTemperaturaMin() {
		return temperaturaMin;
	}

	public void setTemperaturaMin(int temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}

}
