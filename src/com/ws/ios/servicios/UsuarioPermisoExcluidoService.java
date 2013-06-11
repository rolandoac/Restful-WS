package com.ws.ios.servicios;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.ws.ios.dominio.UsuarioPermisoExcluido;
import com.ws.ios.persistencia.mapeos.UsuarioPermisoExcluidoMapper;

public class UsuarioPermisoExcluidoService {
	private SqlSessionFactory mySessionFactory = null;
	
	public UsuarioPermisoExcluidoService(SqlSessionFactory sf) {
		this.mySessionFactory = sf;
	}
	
	public ArrayList<UsuarioPermisoExcluido> getUsuarioPermisosExcluidos(int idUsuario) {
		ArrayList<UsuarioPermisoExcluido> listUsuarioPermisosExcluidos = null;
		
		SqlSession session = mySessionFactory.openSession();
		
		try {
			 UsuarioPermisoExcluidoMapper mapper = session.getMapper(UsuarioPermisoExcluidoMapper.class);
			 listUsuarioPermisosExcluidos = mapper.getUsuarioPermisosExcluidos(idUsuario);
		} 
		finally {
           session.close();
        }
		
		return listUsuarioPermisosExcluidos;
	}
	
	public boolean creaUsuarioPermisoExcluido(UsuarioPermisoExcluido usuarioPermisoExcluido) {
		boolean commiteado = false;
		
		return commiteado;			
	}
	
	public boolean eliminaUsuarioPermisoExcluido(UsuarioPermisoExcluido usuarioPermisoExcluido) {
		boolean commiteado = false;
		
		return commiteado;			
	}
	
	public boolean eliminaUsuarioPermisosExcluidos(int idUsuario) {
		boolean commiteado = false;
		
		return commiteado;			
	}
}
