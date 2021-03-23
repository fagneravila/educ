package com.avila.educacional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avila.educacional.domain.Turma;
import com.avila.educacional.services.TurmaService;

@RestController
@RequestMapping(value = "/turma")
public class TurmaController {

	@Autowired
	private TurmaService service;
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		Turma obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	
	
}
}