package com.ws.ios.servicios;

import com.ws.ios.dominio.Persona;
import com.ws.ios.persistencia.mapeos.PersonaMapper;
import java.util.ArrayList;
import org.apache.ibatis.session.*;

public class PersonaService {    
	private SqlSessionFactory mySessionFactory = null;
	
	
	public PersonaService(SqlSessionFactory sf) {
		this.mySessionFactory = sf;
	}
	
    public ArrayList<Persona> getPersonas() throws Exception {
		ArrayList<Persona> listPersonas = null;
		
		SqlSession session = mySessionFactory.openSession();

		try {
			 PersonaMapper mapper = session.getMapper(PersonaMapper.class);
	         listPersonas = mapper.getPersonas();
		} 
		finally {
            session.close();
        }
		
		return listPersonas;
	}
    
	public Persona getPersona(int idPersona) {
		Persona persona = null;
		
		return persona;
	}
	
	public boolean creaPersona(Persona persona) {
		boolean commiteado = false;
		
		return commiteado;
	}
	
	public boolean modificaPersona(Persona persona) {
		boolean commiteado = false;
		
		return commiteado;
	}
	
	public boolean eliminaPersona(int idPersona) {
		boolean commiteado = false;
		
		return commiteado;
	}
}