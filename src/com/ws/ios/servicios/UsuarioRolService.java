package com.ws.ios.servicios;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.ws.ios.dominio.UsuarioRol;
import com.ws.ios.persistencia.mapeos.UsuarioRolMapper;

public class UsuarioRolService {
	private SqlSessionFactory mySessionFactory = null;
	
	public UsuarioRolService(SqlSessionFactory sf) {
		this.mySessionFactory = sf;
	}
	
	public ArrayList<UsuarioRol> getUsuarioRoles(int idUsuario) {
		ArrayList<UsuarioRol> listUsuarioRoles = null;
		
		SqlSession session = mySessionFactory.openSession();
		
		try {
			 UsuarioRolMapper mapper = session.getMapper(UsuarioRolMapper.class);
			 listUsuarioRoles = mapper.getUsuarioRoles(idUsuario);
		} 
		finally {
            session.close();
        }
		
		return listUsuarioRoles;
	}
	
	public boolean creaUsuarioRol(UsuarioRol usuarioRol) {
		boolean commiteado = false;
		
		return commiteado;			
	}
	
	public boolean eliminaUsuarioRol(UsuarioRol usuarioRol) {
		boolean commiteado = false;
		
		return commiteado;			
	}
	
	public boolean eliminaUsuarioRoles(int idUsuario) {
		boolean commiteado = false;
		
		return commiteado;			
	}
}
