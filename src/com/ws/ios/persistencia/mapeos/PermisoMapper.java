package com.ws.ios.persistencia.mapeos;

import java.util.ArrayList;
import com.ws.ios.dominio.Permiso;

public interface PermisoMapper {
	ArrayList<Permiso> getPermisos();
	Permiso getPermiso(int idPermiso);
	void creaPermiso(Permiso permiso);
	void modificaPermiso(Permiso permiso);
	void eliminaPermiso(int idPermiso);
}
