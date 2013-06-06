package com.ws.ios.persistencia.mapeos;

import java.util.ArrayList;
import com.ws.ios.dominio.UsuarioPermisoEspecial;

public interface UsuarioPermisoEspecialMapper {
	ArrayList<UsuarioPermisoEspecial> getUsuarioPermisosEspeciales(int idUsuario);
	void creaUsuarioPermisoEspecial(UsuarioPermisoEspecial usuarioPermisoEspecial);
	void eliminaUsuarioPermisoEspecial(UsuarioPermisoEspecial usuarioPermisoEspecial);
	void eliminaUsuarioPermisosEspeciales(int idUsuario);
}
