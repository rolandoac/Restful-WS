package com.ws.ios.servicios;

import com.ws.ios.dominio.Permiso;
import com.ws.ios.persistencia.mapeos.PermisoMapper;
import java.util.ArrayList;
import org.apache.ibatis.session.*;

public class PermisoService {
	private SqlSessionFactory mySessionFactory = null;
	
	public PermisoService(SqlSessionFactory sf) {
		this.mySessionFactory = sf;
	}
	
	 public ArrayList<Permiso> getPermisos() throws Exception {
		ArrayList<Permiso> listPermisos = null;
		
		SqlSession session = mySessionFactory.openSession();

	    try {
		    PermisoMapper mapper = session.getMapper(PermisoMapper.class);
		    listPermisos = mapper.getPermisos();
	    } 
		finally {
	        session.close();
	    }
			
		return listPermisos;
	}
	
	public Permiso getPermiso(int idPermiso) {
		Permiso permiso = null;
		
		return permiso;		
	}
	
	public boolean creaPermiso(Permiso permiso) {
		boolean commiteado = false;
		
		return commiteado;
	}
	
	public boolean modificaPermiso(Permiso permiso) {
		boolean commiteado = false;
		
		return commiteado;
	}
	
	public boolean eliminaPermiso(int idPermiso) {
		boolean commiteado = false;
		
		return commiteado;
	}
}   
