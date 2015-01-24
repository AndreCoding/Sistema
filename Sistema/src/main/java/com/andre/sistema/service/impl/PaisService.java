package com.andre.sistema.service.impl;

import java.util.List;

import com.andre.sistema.dao.IPaisDAO;
import com.andre.sistema.domain.T0006paises;
import com.andre.sistema.service.IPaisService;

public class PaisService  implements IPaisService{

	private IPaisDAO paisDAO;
	@Override
	public T0006paises getPaisByCode(int idPais) throws Exception {
		// TODO Auto-generated method stub
		return paisDAO.obtenerPaisPorCodigo(idPais);
	}
	
	@Override
	public List<T0006paises> getAll() throws Exception {
		return paisDAO.obtenerTodo();
	}
	
	public IPaisDAO getPaisDAO() {
		return paisDAO;
	}
	public void setPaisDAO(IPaisDAO paisDAO) {
		this.paisDAO = paisDAO;
	}



	
	

}
