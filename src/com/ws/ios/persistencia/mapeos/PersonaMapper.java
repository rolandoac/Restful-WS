package com.ws.ios.persistencia.mapeos;

import java.util.ArrayList;
import com.ws.ios.dominio.Persona;

public interface PersonaMapper {	
	ArrayList<Persona> getPersonas();
	Persona getPersona(int idPersona);
	void creaPersona(Persona persona);
	void modificaPersona(Persona persona);
	void eliminaPersona(int idPersona);
}
