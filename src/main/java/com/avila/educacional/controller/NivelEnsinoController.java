package com.avila.educacional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avila.educacional.domain.NivelEnsino;
import com.avila.educacional.services.NivelEnsinoService;

@RestController
@RequestMapping(value = "/nivelensino")
public class NivelEnsinoController {
	
	
	@Autowired
	private NivelEnsinoService service;
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		NivelEnsino obj = service.find(id);
		return ResponseEntity.ok().body(obj);

	}
	

}
