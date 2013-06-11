package com.ws.ios.servicios;

import java.util.ArrayList;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.ws.ios.dominio.RolPermiso;
import com.ws.ios.persistencia.mapeos.RolPermisoMapper;

public class RolPermisoService {
	private SqlSessionFactory mySessionFactory = null;
	
	public RolPermisoService(SqlSessionFactory sf) {
		this.mySessionFactory = sf;
	}
	
	public ArrayList<RolPermiso> getRolPermisos(int idRol) throws Exception {
		ArrayList<RolPermiso> listRolPermisos = null;
		
		SqlSession session = mySessionFactory.openSession();

		try {
			 RolPermisoMapper mapper = session.getMapper(RolPermisoMapper.class);
			 listRolPermisos = mapper.getRolPermisos(idRol);
		} 
		finally {
            session.close();
        }
		
		return listRolPermisos;
	}
	
	public boolean creaRolPermiso(RolPermiso rolPermiso) {
		boolean commiteado = false;
		
		return commiteado;
	}
	
	public boolean eliminaRolPermiso(RolPermiso rolPemiso) {
		boolean commiteado = false;
		
		return commiteado;
	}
	
	public boolean eliminaRolPermisos(int idRol) {
		boolean commiteado = false;
		
		return commiteado;
	}
}
