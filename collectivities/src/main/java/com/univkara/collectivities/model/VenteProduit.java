package com.univkara.collectivities.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class VenteProduit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "prix_unitaire")
	private int prixUnitaire;
	
	@Column(name = "quantite")
	private int quantite;

	public VenteProduit() {
		super();
	}


	public VenteProduit(int prixUnitaire, int quantite) {
		super();
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(int prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	
	
	
}
