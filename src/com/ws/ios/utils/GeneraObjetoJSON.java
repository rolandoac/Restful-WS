package com.ws.ios.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import com.ws.ios.dominio.Permiso;

public class GeneraObjetoJSON {

    public static void main(String ars[]) {

    	Permiso permiso = new Permiso();
    	permiso.setIdPermiso(1);
    	permiso.setClave("1");
    	permiso.setNombre("Acceso al menu principal"); 
    	permiso.setDescripcion("Permiso para acceso al menu principal");

        ObjectMapper mapper = new ObjectMapper();
        
        try {
             ByteArrayOutputStream os= new ByteArrayOutputStream();
             mapper.writeValue(os, permiso);
            System.out.println(mapper.writeValueAsString(permiso));
        }
        catch (JsonGenerationException e) {
            e.printStackTrace();
        } 
        catch (JsonMappingException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}