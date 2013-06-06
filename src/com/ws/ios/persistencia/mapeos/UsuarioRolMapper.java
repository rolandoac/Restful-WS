package com.ws.ios.persistencia.mapeos;

import java.util.ArrayList;
import com.ws.ios.dominio.UsuarioRol;

public interface UsuarioRolMapper {
	ArrayList<UsuarioRol> getUsuarioRoles(int idUsuario);
	void creaUsuarioRol(UsuarioRol usuarioRol);
	void eliminaUsuarioRol(UsuarioRol usuarioRol);
	void eliminaUsuarioRoles(int idUsuario);
}
