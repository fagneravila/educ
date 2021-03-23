package com.avila.educacional.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avila.educacional.domain.Turma;
import com.avila.educacional.repository.TurmaRepository;
import com.avila.educacional.services.exceptions.ObjectNotFoundException;

@Service
public class TurmaService {

	@Autowired
	private TurmaRepository repository;

	public Turma find(Integer id) {
		Optional<Turma> obj = repository.findById(id);
		return obj.orElseThrow(() -> 
		 new ObjectNotFoundException(
				    "Objeto não Encontrado! Id " + id + ", Tipo: " + Turma.class.getName()));

	}
	
	
}
