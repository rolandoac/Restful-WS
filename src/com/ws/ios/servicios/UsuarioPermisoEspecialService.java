package com.ws.ios.servicios;

import java.util.ArrayList;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.ws.ios.dominio.UsuarioPermisoEspecial;
import com.ws.ios.persistencia.mapeos.UsuarioPermisoEspecialMapper;

public class UsuarioPermisoEspecialService {
	private SqlSessionFactory mySessionFactory = null;
	
	public UsuarioPermisoEspecialService(SqlSessionFactory sf) {
		this.mySessionFactory = sf;
	}
	
	public ArrayList<UsuarioPermisoEspecial> getUsuarioPermisosEspeciales(int idUsuario) {
		ArrayList<UsuarioPermisoEspecial> listUsuarioPermisosEspeciales = null;
		
		SqlSession session = mySessionFactory.openSession();
		
		try {
			 UsuarioPermisoEspecialMapper mapper = session.getMapper(UsuarioPermisoEspecialMapper.class);
			 listUsuarioPermisosEspeciales = mapper.getUsuarioPermisosEspeciales(idUsuario);
		} 
		finally {
           session.close();
        }
		
		return listUsuarioPermisosEspeciales;
	}
	
	public boolean creaUsuarioPermisoEspecial(UsuarioPermisoEspecial usuarioPermisoEspecial) {
		boolean commiteado = false;
		
		return commiteado;			
	}
	
	public boolean eliminaUsuarioPermisoEspecial(UsuarioPermisoEspecial usuarioPermisoEspecial) {
		boolean commiteado = false;
		
		return commiteado;			
	}
	
	public boolean eliminaUsuarioPermisosEspeciales(int idUsuario) {
		boolean commiteado = false;
		
		return commiteado;			
	}
}
