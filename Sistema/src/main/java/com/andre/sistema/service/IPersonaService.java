package com.andre.sistema.service;

import java.util.List;

import com.andre.sistema.domain.T0001personas;

public interface IPersonaService {

	
	public List<T0001personas> getAll() throws Exception;
	
	public T0001personas getPersona(String codigoPersona) throws Exception;
}
