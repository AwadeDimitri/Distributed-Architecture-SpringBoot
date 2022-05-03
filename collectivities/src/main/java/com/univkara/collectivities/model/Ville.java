package com.univkara.collectivities.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "villes")
public class Ville {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "population")
	private int population;
	
	@Column(name = "densite")
	private int densite;
	
	@OneToMany(mappedBy = "ville")
	private List<Marche> marches = new ArrayList<>();
	
	
	
	public Ville() {
		super();
	}

	public Ville(String nom, int population, int densite, List<Marche> marches) {
		super();
		this.nom = nom;
		this.population = population;
		this.densite = densite;
		this.marches = marches;
	}





	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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


	public List<Marche> getMarches() {
		return marches;
	}


	public void setMarches(List<Marche> marches) {
		this.marches = marches;
	}
	
	
	
}
