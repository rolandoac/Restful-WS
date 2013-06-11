package com.ws.ios.servicios;

import com.ws.ios.dominio.TipoUsuario;
import com.ws.ios.persistencia.mapeos.TipoUsuarioMapper;
import java.util.ArrayList;
import org.apache.ibatis.session.*;

public class TipoUsuarioService { 
	private SqlSessionFactory mySessionFactory = null;
	
	public TipoUsuarioService(SqlSessionFactory sf) {
		this.mySessionFactory = sf;
	}
	
    public ArrayList<TipoUsuario> getTiposUsuario() throws Exception {
		ArrayList<TipoUsuario> listTiposUsuario = null;
		
		SqlSession session = mySessionFactory.openSession();

		try {
			 TipoUsuarioMapper mapper = session.getMapper(TipoUsuarioMapper.class);
	         listTiposUsuario = mapper.getTiposUsuario();
		} 
		finally {
            session.close();
        }
		
		return listTiposUsuario;
	}
    
    public TipoUsuario getTipoUsuario(int idTipoUsuario) {
    	TipoUsuario tipoUsuario = null;
    	
    	return tipoUsuario;
    }
    
    public boolean creaTipoUsuario(TipoUsuario tipoUsuario) {
		boolean commiteado = false;
		
		return commiteado;		
	}
	
	public boolean modificaTipoUsuario(TipoUsuario tipoUsuario) {
		boolean commiteado = false;
		
		return commiteado;		
	}
	
	public boolean eliminaTipoUsuario(int idTipoUsuario) {
		boolean commiteado = false;
		
		return commiteado;				
	}
}