package com.andre.sistema.service;

import java.util.List;

import com.andre.sistema.domain.T0006paises;

public interface IPaisService {
	public T0006paises getPaisByCode(int idPais) throws Exception;
	
	public List<T0006paises> getAll() throws Exception;
}
