package com.andre.sistema.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.andre.sistema.dao.IPersonaDAO;
import com.andre.sistema.domain.T0001personas;

public class PersonaDAO implements IPersonaDAO {

	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	public List<T0001personas> getAll() throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		List<T0001personas> personas = session.createQuery("from T0001personas").list();
		session.close();
		return personas;
	}


	public T0001personas getPersona(String codigoPersona) throws Exception {
		Session session = sessionFactory.openSession();
		String hqlQuery = "from T0001personas persona where persona.c0001codpersona =:codigoPersona";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("codigoPersona", codigoPersona);
		return (T0001personas)query.uniqueResult();
	}

}
