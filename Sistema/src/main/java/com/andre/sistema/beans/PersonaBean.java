package com.andre.sistema.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

import com.andre.sistema.domain.T0001personas;
import com.andre.sistema.domain.T0003subtippersona;
import com.andre.sistema.domain.T0006paises;
import com.andre.sistema.service.IPaisService;
import com.andre.sistema.service.IPersonaService;
import com.andre.sistema.service.ISubtipoPersonaService;

@ManagedBean
@ViewScoped
public class PersonaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// private T0001personas persona;

	@ManagedProperty(value = "#{PersonaService}")
	private IPersonaService personaService;
	@ManagedProperty(value="#{PaisService}")
	private IPaisService paisService;
	@ManagedProperty(value="#{SubtipoPersonaService}")
	private ISubtipoPersonaService subtipoPersonaService;

	private List<T0001personas> listaPersonas;

	private List<T0006paises> listaPaises;
	
	private List<T0003subtippersona> listaSubtipoPersonas;
	
	public boolean selectTodos;

	/*
	 * public T0001personas getPersona() { return persona; }
	 * 
	 * public void setPersona(T0001personas persona) { this.persona = persona; }
	 */
	@PostConstruct
	public void init() {
		// persona = new T0001personas();
		listaPersonas = new ArrayList<T0001personas>();
		listaPaises = new ArrayList<T0006paises>();
		listaSubtipoPersonas = new ArrayList<T0003subtippersona>();
		
		try{
			listaPaises = paisService.getAll();
			listaSubtipoPersonas = subtipoPersonaService.getAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		selectTodos = false;
		/*
		 * try{
		 * 
		 * listaPersonas = personaService.getAll();
		 * System.out.println(listaPersonas.size()); }catch(Exception e){
		 * e.printStackTrace(); }
		 */

	}

	public void fillList() {
		try {
			if (!selectTodos) {
				RequestContext context = RequestContext.getCurrentInstance();
				context.execute("PF('dlg1').show();");
			} else {
				listaPersonas = personaService.getAll();
				System.out.println(listaPersonas.size());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	public String getPaisPorPersona(int id){
		try{
			String resultado = "";
			for(T0006paises pais : listaPaises){
			if(id== pais.getI0006idpais()){
				resultado = pais.getC0006nombre();
				break;
			}
			
		}
			return resultado;
			
		}catch(Exception e){
			e.printStackTrace();
			return "";
			
		}
	}*/
	
	public String getNombreSubtipo(int id){
		try{
			String resultado ="";
			for(T0003subtippersona subtipoPersona : listaSubtipoPersonas){
				if(subtipoPersona.getI0003idsubtippers()==id){
					resultado = subtipoPersona.getC0003nombre();
					break;
				}
				
			}
			return resultado;
		}catch(Exception e){
			e.printStackTrace();
			return "";
		}
	}

	

	public boolean isSelectTodos() {
		return selectTodos;
	}

	public void setSelectTodos(boolean selectTodos) {
		this.selectTodos = selectTodos;
	}

	public long getTotalRegisters() {
		return this.listaPersonas.size();
	}

	public List<T0001personas> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<T0001personas> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	public IPersonaService getPersonaService() {
		return personaService;
	}

	public void setPersonaService(IPersonaService personaService) {
		this.personaService = personaService;
	}

	public IPaisService getPaisService() {
		return paisService;
	}

	public void setPaisService(IPaisService paisService) {
		this.paisService = paisService;
	}

	public List<T0006paises> getListaPaises() {
		return listaPaises;
	}

	public void setListaPaises(List<T0006paises> listaPaises) {
		this.listaPaises = listaPaises;
	}

	public ISubtipoPersonaService getSubtipoPersonaService() {
		return subtipoPersonaService;
	}

	public void setSubtipoPersonaService(
			ISubtipoPersonaService subtipoPersonaService) {
		this.subtipoPersonaService = subtipoPersonaService;
	}

	public List<T0003subtippersona> getListaSubtipoPersonas() {
		return listaSubtipoPersonas;
	}

	public void setListaSubtipoPersonas(
			List<T0003subtippersona> listaSubtipoPersonas) {
		this.listaSubtipoPersonas = listaSubtipoPersonas;
	}

	
	
	

	

	
	
	

}
