package com.univkara.collectivities.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "produits")
public class Produit {
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "type")
	private TypeProduit type;

	public Produit() {
		super();
	}

	public Produit(String nom, TypeProduit type) {
		super();
		this.nom = nom;
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public TypeProduit getType() {
		return type;
	}

	public void setType(TypeProduit type) {
		this.type = type;
	}
	
	
}
