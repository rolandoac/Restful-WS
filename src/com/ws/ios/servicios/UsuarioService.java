package com.ws.ios.servicios;

import com.ws.ios.dominio.Usuario;
import com.ws.ios.persistencia.mapeos.UsuarioMapper;
import java.util.ArrayList;
import org.apache.ibatis.session.*;

public class UsuarioService {
	private SqlSessionFactory mySessionFactory = null;
	
	public UsuarioService(SqlSessionFactory sf) {
		this.mySessionFactory = sf;
	}
	
    public ArrayList<Usuario> getUsuarios() throws Exception {
		ArrayList<Usuario> listUsuarios = null;
		
		SqlSession session = mySessionFactory.openSession();
		
		try {
			 UsuarioMapper mapper = session.getMapper(UsuarioMapper.class);
	         listUsuarios = mapper.getUsuarios();
		} 
		finally {
            session.close();
        }
		
		return listUsuarios;
	}
    
	public Usuario getUsuario(int idUsuario) {
		Usuario usuario = null;
		
		return usuario;
	}
	
	public boolean creaUsuario(Usuario usuario) {
		boolean commiteado = false;
		
		return commiteado;				
	}
	
	public boolean modificaUsuario(Usuario usuario) {
		boolean commiteado = false;
		
		return commiteado;				
	}
	
	public boolean eliminaUsuario(int idUsuario) {
		boolean commiteado = false;
		
		return commiteado;				
	}
}