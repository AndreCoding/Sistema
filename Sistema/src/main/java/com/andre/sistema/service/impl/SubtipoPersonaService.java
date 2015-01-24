package com.andre.sistema.service.impl;

import java.util.List;

import com.andre.sistema.dao.ISubtipoPersonaDAO;
import com.andre.sistema.domain.T0003subtippersona;
import com.andre.sistema.service.ISubtipoPersonaService;

public class SubtipoPersonaService implements ISubtipoPersonaService {

	
	private ISubtipoPersonaDAO subtipoPersonaDAO;
	
	
	public ISubtipoPersonaDAO getSubtipoPersonaDAO() {
		return subtipoPersonaDAO;
	}


	public void setSubtipoPersonaDAO(ISubtipoPersonaDAO subtipoPersonaDAO) {
		this.subtipoPersonaDAO = subtipoPersonaDAO;
	}


	@Override
	public List<T0003subtippersona> getAll() throws Exception {
		// TODO Auto-generated method stub
		return subtipoPersonaDAO.obtenerTodos();
	}

}
