package com.avila.educacional.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {


	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String nome) {
		super(nome);
	}
	
	public ObjectNotFoundException(String nome,  Throwable causa) {
		super(nome, causa);
	}
	
	
}
