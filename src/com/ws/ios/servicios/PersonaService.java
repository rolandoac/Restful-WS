package com.ws.ios.servicios;

import com.ws.ios.dominio.Persona;
import com.ws.ios.persistencia.mapeos.*;
import java.io.*;
import java.util.ArrayList;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

public class PersonaService {    
    public ArrayList<Persona> getPersonas() throws Exception {
		ArrayList<Persona> listPersonas = null;
		
	    PersonaService personaService = new PersonaService();
	    SqlSessionFactory factory = personaService.getSessionFactory();       
	    SqlSession session = factory.openSession();

		try {
			 PersonaMapper mapper = session.getMapper(PersonaMapper.class);
	         listPersonas = mapper.getPersonas();
		} 
		finally {
            session.close();
        }
		
		return listPersonas;
	}

    public SqlSessionFactory getSessionFactory() throws IOException {
        String res = "com/ws/ios/config/Configuration.xml";
        Reader reader = Resources.getResourceAsReader(res);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        
        return builder.build(reader);
    }
}