package com.ws.ios.persistencia.mapeos;

import java.util.ArrayList;
import com.ws.ios.dominio.Usuario;

public interface UsuarioMapper {
	ArrayList<Usuario> getUsuarios();
	Usuario getUsuario(int idUsuario);
	void creaUsuario(Usuario usuario);
	void modificaUsuario(Usuario usuario);
	void eliminaUsuario(int idUsuario);
}
