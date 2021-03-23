package com.avila.educacional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avila.educacional.domain.Professor;
import com.avila.educacional.services.ProfessorService;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorController {

	@Autowired
	private ProfessorService  service;
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		Professor obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	
	
}
}