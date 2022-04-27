package com.univkara.collectivities.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity()
@Table(name = "communes")
public class Commune {

	@Column(name = "nom")
	private String nom;
	
	@Column(name ="date_creation")
	private String dateCreation;
	
	@Column(name ="poulation")
	private int population;
	
	public Commune() {
		super();
	}

	public Commune(String nom, String dateCreation, int population) {
		super();
		this.nom = nom;
		this.dateCreation = dateCreation;
		this.population = population;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	
	
	
}
