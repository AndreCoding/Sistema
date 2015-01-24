package com.andre.sistema.service.impl;

import java.util.List;



import org.springframework.transaction.annotation.Transactional;

import com.andre.sistema.dao.IPersonaDAO;
import com.andre.sistema.domain.T0001personas;
import com.andre.sistema.service.IPersonaService;

@Transactional(readOnly=true)
public class PersonaService implements IPersonaService {

	
	private IPersonaDAO personaDAO;
	
	
	
	public IPersonaDAO getPersonaDAO() {
		return personaDAO;
	}



	public void setPersonaDAO(IPersonaDAO personaDAO) {
		this.personaDAO = personaDAO;
	}


	@Transactional(readOnly=false)
	@Override
	public List<T0001personas> getAll() throws Exception{
		// TODO Auto-generated method stub
		return personaDAO.getAll();
	}



	@Override
	public T0001personas getPersona(String codigoPersona) throws Exception {
		// TODO Auto-generated method stub
		return personaDAO.getPersona(codigoPersona);
	}

}
