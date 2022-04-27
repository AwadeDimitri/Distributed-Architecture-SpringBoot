package com.univkara.collectivities.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
public class Region {
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "population")
	private int population;
	
	@Column(name = "superficie")
	private float superficie;
	
	
	
	public Region() {
		super();
	}
	public Region(String nom, int population, float superficie) {
		super();
		this.nom = nom;
		this.population = population;
		this.superficie = superficie;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public float getSuperficie() {
		return superficie;
	}
	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}
	
	
	
}
