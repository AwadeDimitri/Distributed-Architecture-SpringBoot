package com.univkara.collectivities.dto;


public class MarcheDto {

	private String nom;
	private String emplacement;
	private String superficie;
	
	
	public MarcheDto() {
		super();
	}
	
	
	public MarcheDto(String nom, String emplacememnt, String superficie) {
		super();
		this.nom = nom;
		this.emplacement = emplacememnt;
		this.superficie = superficie;
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
	
	
	
	
}
