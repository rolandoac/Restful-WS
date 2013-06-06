package com.ws.ios.persistencia.mapeos;

import java.util.ArrayList;
import com.ws.ios.dominio.TipoUsuario;

public interface TipoUsuarioMapper {
	ArrayList<TipoUsuario> getTiposUsuario();
	TipoUsuario getTipoUsuario(int idTipoUsuario);
	void creaTipoUsuario(TipoUsuario tipoUsuario);
	void modificaTipoUsuario(TipoUsuario tipoUsuario);
	void eliminaTipoUsuario(int idTipoUsuario);
}
