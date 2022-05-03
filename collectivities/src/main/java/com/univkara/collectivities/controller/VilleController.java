package com.univkara.collectivities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univkara.collectivities.dto.VilleDto;
import com.univkara.collectivities.model.Ville;
import com.univkara.collectivities.repository.MarcheRepository;
import com.univkara.collectivities.repository.VilleRepository;

@RestController
@RequestMapping("/api")
public class VilleController {
	
	private VilleRepository villeRepository;

	@Autowired
	private MarcheRepository marcheRepository;
	
	//create a new city
	@PostMapping("/ville")
	public ResponseEntity<Ville> createVille(@RequestBody VilleDto villeDto){
		try {
				return new ResponseEntity<>(villeDto.getVille(),HttpStatus.CREATED);		
		} catch (Exception e) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
