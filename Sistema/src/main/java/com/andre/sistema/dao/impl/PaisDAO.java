package com.andre.sistema.dao.impl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.andre.sistema.dao.IPaisDAO;
import com.andre.sistema.domain.T0006paises;

public class PaisDAO implements IPaisDAO{
	
	private SessionFactory sessionFactory;


	public T0006paises obtenerPaisPorCodigo(int idPais) throws Exception {
		
		String hql = "from T0006paises pais where pais.i0006idpais =:idPais";
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hql);
		query.setParameter("idPais", idPais);
		T0006paises paisResult = (T0006paises)query.uniqueResult();
		session.close();
		return paisResult;
	}

	public List<T0006paises> obtenerTodo() throws Exception {
		String hql = "from T0006paises";
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hql);
		List<T0006paises> paises = query.list();
		session.close();
		return paises;
	}
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}




	

	
}
