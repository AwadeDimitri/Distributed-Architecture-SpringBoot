package com.univkara.collectivities.dto;

import com.univkara.collectivities.model.Ville;

public class VilleDto {

	private Ville ville;

	public VilleDto() {
		super();
	}

	public VilleDto(Ville ville) {
		super();
		this.ville = ville;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	
}
