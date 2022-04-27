package com.univkara.collectivities.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "villes")
public class Ville {
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "population")
	private int population;
	
	@Column(name = "densite")
	private int densite;
	
	public Ville() {
		super();
	}

	public Ville(String nom, int population, int densite) {
		super();
		this.nom = nom;
		this.population = population;
		this.densite = densite;
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

	public int getDensite() {
		return densite;
	}

	public void setDensite(int densite) {
		this.densite = densite;
	}
	
	
}
