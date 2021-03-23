package com.avila.educacional.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/periodoletivo")
public class PeriodoLetivo {

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "ta funcionando";
	}
	
}
