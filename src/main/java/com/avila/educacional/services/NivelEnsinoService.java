package com.avila.educacional.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avila.educacional.domain.NivelEnsino;
import com.avila.educacional.repository.NivelEnsinoRepository;

@Service
public class NivelEnsinoService {

	@Autowired
	private NivelEnsinoRepository repository;

	public NivelEnsino find(Integer id) {
		Optional<NivelEnsino> obj = repository.findById(id);
		return obj.orElse(null);

	}

}
