package com.ws.ios.servicios;

import java.util.*;
import javax.ws.rs.*;
import com.ws.ios.dominio.*;
import com.google.gson.Gson;

@Path("/WebService")
public class ServiciosPublicados {
	
	@GET
	@Path("/GetPermisos")
	@Produces("application/json")
	public String permisos() {
		String permisos  = null;
		
		try {
			ArrayList<Permiso> listPermisos = null;
			PermisoService permisoService = new PermisoService();
			listPermisos = permisoService.getPermisos();
			Gson gson = new Gson();
			permisos = gson.toJson(listPermisos);
		} 
		catch (Exception e) {
			System.out.println("Error al obtener el listado de permisos");
		}
		
		return permisos;
	}
	
	@GET
	@Path("/GetUsuarios")
	@Produces("application/json")
	public String usuarios() {
		String usuarios  = null;
		
		try {
			ArrayList<Usuario> listUsuarios = null;
			UsuarioService usuarioService = new UsuarioService();
			listUsuarios = usuarioService.getUsuarios();
			Gson gson = new Gson();
			usuarios = gson.toJson(listUsuarios);
		} 
		catch (Exception e) {
			System.out.println("Error al obtener el listado de usuarios");
		}
		
		return usuarios;
	}
	
	@GET
	@Path("/GetPersonas")
	@Produces("application/json")
	public String personas() {
		String personas  = null;
		
		try {
			ArrayList<Persona> listPersonas = null;
			PersonaService personaService = new PersonaService();
			listPersonas = personaService.getPersonas();
			Gson gson = new Gson();
			personas = gson.toJson(listPersonas);
		} 
		catch (Exception e) {
			System.out.println("Error al obtener el listado de personas");
		}
		
		return personas;
	}

	@GET
	@Path("/GetTiposUsuario")
	@Produces("application/json")
	public String tiposUsuario() {
		String tiposUsuario  = null;
		
		try {
			ArrayList<TipoUsuario> listTiposUsuario = null;
			TipoUsuarioService tipoUsuarioService = new TipoUsuarioService();
			listTiposUsuario = tipoUsuarioService.getTiposUsuario();
			Gson gson = new Gson();
			tiposUsuario = gson.toJson(listTiposUsuario);
		} 
		catch (Exception e) {
			System.out.println("Error al obtener el listado de tipos de usuario");
		}
		
		return tiposUsuario;
	}
}
