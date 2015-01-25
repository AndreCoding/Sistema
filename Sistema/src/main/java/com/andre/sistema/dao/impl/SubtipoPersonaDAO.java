package com.andre.sistema.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.andre.sistema.dao.ISubtipoPersonaDAO;
import com.andre.sistema.domain.T0003subtippersona;

public class SubtipoPersonaDAO implements ISubtipoPersonaDAO {

	private SessionFactory sessionFactory;
	
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	public List<T0003subtippersona> obtenerTodos() throws Exception {
		String hql = "from T0003subtippersona";
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hql);
		List<T0003subtippersona> listaSubtipoPersonas = query.list();
		session.close();
		return listaSubtipoPersonas;
		
	}

}
