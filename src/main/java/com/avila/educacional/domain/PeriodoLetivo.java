package com.avila.educacional.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PeriodoLetivo implements Serializable {

	
	private static final long serialVersionUID = 1L;
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String descricao;
	
	private int idperiodoant;
	
	 public PeriodoLetivo() {
		 
	 }

	public PeriodoLetivo(int id, String descricao, int idperiodoant) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.idperiodoant = idperiodoant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getIdperiodoant() {
		return idperiodoant;
	}

	public void setIdperiodoant(int idperiodoant) {
		this.idperiodoant = idperiodoant;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeriodoLetivo other = (PeriodoLetivo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	 
	 
	
	
}
