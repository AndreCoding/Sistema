package com.andre.sistema.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.andre.sistema.domain.T0001personas;
import com.andre.sistema.service.IPersonaService;

@ManagedBean
@RequestScoped
public class PersonaBusqueda {

	@ManagedProperty(value="#{PersonaService}")
	private IPersonaService personaService;
	
	private T0001personas persona;
	
	@PostConstruct
	public void init(){
		persona = new T0001personas();
	}

	public IPersonaService getPersonaService() {
		return personaService;
	}

	public void setPersonaService(IPersonaService personaService) {
		this.personaService = personaService;
	}

	public T0001personas getPersona() {
		return persona;
	}

	public void setPersona(T0001personas persona) {
		this.persona = persona;
	}
	
	
	public String buscarPersona(){
		try{
			this.persona = personaService.getPersona(this.persona.getC0001codpersona());
			
			System.out.println("Persona Consultada " + this.persona.toString());
			return "/index.xhtml";
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
