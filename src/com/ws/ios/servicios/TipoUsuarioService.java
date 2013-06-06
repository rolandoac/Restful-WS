package com.ws.ios.servicios;

import com.ws.ios.dominio.TipoUsuario;
import com.ws.ios.persistencia.mapeos.*;
import java.io.*;
import java.util.ArrayList;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

public class TipoUsuarioService { 
    public ArrayList<TipoUsuario> getTiposUsuario() throws Exception {
		ArrayList<TipoUsuario> listTiposUsuario = null;
		
	    PersonaService tipoUsuarioService = new PersonaService();
	    SqlSessionFactory factory = tipoUsuarioService.getSessionFactory();       
	    SqlSession session = factory.openSession();

		try {
			 TipoUsuarioMapper mapper = session.getMapper(TipoUsuarioMapper.class);
	         listTiposUsuario = mapper.getTiposUsuario();
		} 
		finally {
            session.close();
        }
		
		return listTiposUsuario;
	}

    public SqlSessionFactory getSessionFactory() throws IOException {
        String res = "com/ws/ios/config/Configuration.xml";
        Reader reader = Resources.getResourceAsReader(res);

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        
        return builder.build(reader);
    }
}