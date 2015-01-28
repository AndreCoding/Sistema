package com.andre.sistema.dao.impl;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;




import com.andre.sistema.dao.IDomicilioDAO;
import com.andre.sistema.domain.T0017personasdomicilios;

public class DomicioDAO implements IDomicilioDAO {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public String obtenerDomicilioPorCodigo(String codPersona)
			throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		StringBuffer domicilio = new StringBuffer();
		session.doWork((con)->{
			Statement stm= null;
			String query = "select * from fncobtenerdomiciliospersona('"+codPersona+"')";
			stm = con.createStatement();
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()){
				domicilio.append(rs.getString(9));
				domicilio.append(" ");
				domicilio.append(rs.getString(8));
				domicilio.append(" ");
				domicilio.append(rs.getString(4));
				domicilio.append(" ");
				domicilio.append(rs.getString(3));
				domicilio.append(" ");
				domicilio.append(rs.getString(5));
				domicilio.append(" ");
				domicilio.append(rs.getString(6));
				domicilio.append(" ");
				
			}
			
		});
		
		session.close();
		return domicilio.toString();
	}

}
