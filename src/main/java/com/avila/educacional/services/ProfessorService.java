package com.avila.educacional.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avila.educacional.domain.Professor;
import com.avila.educacional.repository.ProfessorRepository;
@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository repository;

	public Professor find(Integer id) {
		Optional<Professor> obj = repository.findById(id);
		return obj.orElse(null);

	}
	
	
}
