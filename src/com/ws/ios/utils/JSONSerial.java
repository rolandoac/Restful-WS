package com.ws.ios.utils;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import com.ws.ios.dominio.Permiso;

public class JSONSerial {

    public static void main(String ars[]) {

    	Permiso permiso = new Permiso();
    	permiso.setIdPermiso(1);
    	permiso.setClave("1");
    	permiso.setNombre("Acceso al menu principal"); 
    	permiso.setDescripcion("Permiso para acceso al menu principal");
        
        ObjectMapper mapper = new ObjectMapper();
        try {

            // Generamos la salida a un archivo
            mapper.writeValue(new File("json.txt"), permiso);
            // mostramos por consola
            System.out.println(mapper.writeValueAsString(permiso));
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}