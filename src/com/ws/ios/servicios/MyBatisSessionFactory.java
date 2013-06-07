package com.ws.ios.servicios;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSessionFactory {
	private static MyBatisSessionFactory instance = null;
		   
	protected MyBatisSessionFactory() {
		
	}
	
	public SqlSessionFactory getSessionFactory() throws IOException {
        String res = "com/ws/ios/config/Configuration.xml";
        Reader reader = Resources.getResourceAsReader(res);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        
        return builder.build(reader);
    }
		   
	public static MyBatisSessionFactory getInstance() {
		if (instance == null) {
		    instance = new MyBatisSessionFactory();
		}
	    
        return instance;
	}
}