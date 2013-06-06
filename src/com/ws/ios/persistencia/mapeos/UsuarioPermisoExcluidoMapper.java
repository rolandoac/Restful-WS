package com.ws.ios.persistencia.mapeos;

import java.util.ArrayList;
import com.ws.ios.dominio.UsuarioPermisoExcluido;

public interface UsuarioPermisoExcluidoMapper {
	ArrayList<UsuarioPermisoExcluido> getUsuarioPermisosExcluidos(int idUsuario);
	void creaUsuarioPermisoExcluido(UsuarioPermisoExcluido usuarioPermisoExcluido);
	void eliminaUsuarioPermisoExcluido(UsuarioPermisoExcluido usuarioPermisoExcluido);
	void eliminaUsuarioPermisosExcluidos(int idUsuario);
}
