package com.ws.ios.persistencia.mapeos;

import java.util.ArrayList;
import com.ws.ios.dominio.Rol;

public interface RolMapper {
	ArrayList<Rol> getRoles();
	Rol getRol(int idRol);
	void creaRol(Rol rol);
	void modificaRol(Rol rol);
	void eliminaRol(int idRol);
}
