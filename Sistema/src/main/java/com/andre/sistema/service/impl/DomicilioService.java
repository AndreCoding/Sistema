package com.andre.sistema.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.andre.sistema.dao.IDomicilioDAO;
import com.andre.sistema.domain.T0017personasdomicilios;
import com.andre.sistema.service.IDomicilioService;

@Transactional(readOnly=true)
public class DomicilioService implements IDomicilioService {

	private IDomicilioDAO domicilioDAO;
	
	
	public IDomicilioDAO getDomicilioDAO() {
		return domicilioDAO;
	}


	public void setDomicilioDAO(IDomicilioDAO domicilioDAO) {
		this.domicilioDAO = domicilioDAO;
	}


	@Override
	public String getDomicilioByCode(String codPersona) throws Exception {
		// TODO Auto-generated method stub
		return domicilioDAO.obtenerDomicilioPorCodigo(codPersona);
	}

}
