package com.andre.sistema.dao;

import java.util.List;

import com.andre.sistema.domain.T0001personas;

public interface IPersonaDAO {
	
	public List<T0001personas> getAll() throws Exception;
	
	public T0001personas getPersona(String codigoPersona) throws Exception;

}
