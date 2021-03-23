package com.avila.educacional.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avila.educacional.domain.Disciplina;
import com.avila.educacional.repository.DisciplinaRepository;

@Service
public class DisciplinaService {

	@Autowired
	private DisciplinaRepository repository;

	public Disciplina find(Integer id) {
		Optional<Disciplina> obj = repository.findById(id);
		return obj.orElse(null);

	}
	
	
}
