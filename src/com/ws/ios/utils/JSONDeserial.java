package com.ws.ios.utils;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.ws.ios.dominio.Permiso;

public class JSONDeserial {

    public static void main(String ars[]) {

        ObjectMapper mapper = new ObjectMapper();
        try {

            // Leemos de una archivo o de un String
            Permiso b = mapper.readValue(new File("json.txt"), Permiso.class);
            // Bean b =
            // mapper.readValue("{\"nombre\":\"Bean22\",\"numero\":66543,\"lista\":[\"Item1\",\"Item2\",false,33.33,\"Wed
            // Feb 01 12:03:34 CET 2012\"],\"id\":0}",Bean.class);
            // mostramos algun atributo
            
        	Permiso permiso = new Permiso();
        	permiso.setIdPermiso(1);
        	permiso.setClave("1");
        	permiso.setNombre("Acceso al menu principal"); 
        	permiso.setDescripcion("Permiso para acceso al menu principal");
            
            
            System.out.println(b.getNombre());
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}