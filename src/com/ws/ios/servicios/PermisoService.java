package com.ws.ios.servicios;

import com.ws.ios.dominio.Permiso;
import com.ws.ios.persistencia.mapeos.*;
import java.io.*;
import java.util.ArrayList;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

public class PermisoService {
	  public ArrayList<Permiso> getPermisos() throws Exception {
			ArrayList<Permiso> listPermisos = null;
			
		    PermisoService permisoService = new PermisoService();
		    SqlSessionFactory factory = permisoService.getSessionFactory();       
		    SqlSession session = factory.openSession();

			try {
				 PermisoMapper mapper = session.getMapper(PermisoMapper.class);
				 listPermisos = mapper.getPermisos();
			} 
			finally {
	            session.close();
	        }
			
			return listPermisos;
		}

	    public SqlSessionFactory getSessionFactory() throws IOException {
	        String res = "com/ws/ios/config/Configuration.xml";
	        Reader reader = Resources.getResourceAsReader(res);
	        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
	        
	        return builder.build(reader);
	    }
}
