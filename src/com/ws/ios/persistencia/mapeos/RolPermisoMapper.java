package com.ws.ios.persistencia.mapeos;

import java.util.ArrayList;
import com.ws.ios.dominio.RolPermiso;

public interface RolPermisoMapper {
	ArrayList<RolPermiso> getRolPermisos(int idRol);
	void creaRolPermiso(RolPermiso rolPermiso);
	void eliminaRolPermiso(RolPermiso rolPemiso);
	void eliminaRolPermisos(int idRol);
}
