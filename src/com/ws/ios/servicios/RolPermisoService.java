package com.ws.ios.servicios;

import java.util.ArrayList;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.ws.ios.dominio.RolPermiso;
import com.ws.ios.persistencia.mapeos.RolPermisoMapper;

public class RolPermisoService {
	public ArrayList<RolPermiso> getRolPermisos(int idRol) throws Exception {
		ArrayList<RolPermiso> listRolPermisos = null;
		
		MyBatisSessionFactory myBatisSessionFactory = MyBatisSessionFactory.getInstance();
	    SqlSessionFactory factory = myBatisSessionFactory.getSessionFactory();       
	    SqlSession session = factory.openSession();

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
