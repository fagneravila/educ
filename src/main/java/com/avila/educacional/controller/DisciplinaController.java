package com.avila.educacional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avila.educacional.domain.Disciplina;
import com.avila.educacional.services.DisciplinaService;

@RestController
@RequestMapping(value = "/disciplina")
public class DisciplinaController {

	@Autowired
	private DisciplinaService service;
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		Disciplina obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	
	
}
}