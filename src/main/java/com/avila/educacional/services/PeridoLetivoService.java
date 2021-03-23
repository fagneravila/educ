package com.avila.educacional.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avila.educacional.domain.PeriodoLetivo;
import com.avila.educacional.repository.PeriodoLetivoRepository;


@Service
public class PeridoLetivoService {

	@Autowired
	private PeriodoLetivoRepository repository;
	
	
	public PeriodoLetivo find(Integer id) {
      Optional<PeriodoLetivo> obj = repository.findById(id);
       return obj.orElse(null);
	
	}
	
	
	
}
