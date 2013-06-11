package com.ws.ios.servicios;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.ws.ios.dominio.Rol;
import com.ws.ios.persistencia.mapeos.RolMapper;

public class RolService {
	private SqlSessionFactory mySessionFactory = null;
	
	public RolService(SqlSessionFactory sf) {
		this.mySessionFactory = sf;
	}
	
	public ArrayList<Rol> getRoles() {
		ArrayList<Rol> listRoles = null;
		
		SqlSession session = mySessionFactory.openSession();

		try {
			 RolMapper mapper = session.getMapper(RolMapper.class);
	         listRoles = mapper.getRoles();
		} 
		finally {
           session.close();
        }
		
		return listRoles;
	}
	
	public Rol getRol(int idRol) {
		Rol rol = null;
		
		return rol;
	}
	
	public boolean creaRol(Rol rol) {
		boolean commiteado = false;
		
		return commiteado;		
	}
	
	public boolean modificaRol(Rol rol) {
		boolean commiteado = false;
		
		return commiteado;		
	}
	
	public boolean eliminaRol(int idRol) {
		boolean commiteado = false;
		
		return commiteado;		
	}
}
