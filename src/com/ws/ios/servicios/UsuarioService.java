package com.ws.ios.servicios;

import com.ws.ios.dominio.Usuario;
import com.ws.ios.persistencia.mapeos.*;
import java.io.*;
import java.util.ArrayList;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

public class UsuarioService {
    public ArrayList<Usuario> getUsuarios() throws Exception {
		ArrayList<Usuario> listUsuarios = null;
		
	    UsuarioService usuarioService = new UsuarioService();
	    SqlSessionFactory factory = usuarioService.getSessionFactory();       
	    SqlSession session = factory.openSession();

		try {
			 UsuarioMapper mapper = session.getMapper(UsuarioMapper.class);
	         listUsuarios = mapper.getUsuarios();
		} 
		finally {
            session.close();
        }
		
		return listUsuarios;
	}

    public SqlSessionFactory getSessionFactory() throws IOException {
        String res = "com/ws/ios/config/Configuration.xml";
        Reader reader = Resources.getResourceAsReader(res);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        
        return builder.build(reader);
    }
}