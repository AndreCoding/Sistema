package com.andre.sistema.dao;

import java.util.List;

import com.andre.sistema.domain.T0006paises;

public interface IPaisDAO {
	
	public T0006paises obtenerPaisPorCodigo(int idPais) throws Exception;
	
	public List<T0006paises> obtenerTodo() throws Exception;

}
