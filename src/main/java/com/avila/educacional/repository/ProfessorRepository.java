package com.avila.educacional.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avila.educacional.domain.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer>{

}
