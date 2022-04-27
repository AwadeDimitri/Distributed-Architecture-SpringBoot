package com.univkara.collectivities.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marchés")
public class Marche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "emplacement")
	private String emplacement;
	
	@Column(name = "superficie")
	private String superficie;
	
	@Column(name = "heure_ouverture")
	private String heureOuverture;
	
	@Column(name = "heure_fermeture")
	private String heureFermeture;
	
	public Marche() {
		super();
	}

	public Marche(String nom, String emplacement, String superficie, String heureOuverture, String heureFermeture) {
		super();
		this.nom = nom;
		this.emplacement = emplacement;
		this.superficie = superficie;
		this.heureOuverture = heureOuverture;
		this.heureFermeture = heureFermeture;
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

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public String getHeureOuverture() {
		return heureOuverture;
	}

	public void setHeureOuverture(String heureOuverture) {
		this.heureOuverture = heureOuverture;
	}

	public String getHeureFermeture() {
		return heureFermeture;
	}

	public void setHeureFermeture(String heureFermeture) {
		this.heureFermeture = heureFermeture;
	}
	
}
