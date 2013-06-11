package com.ws.ios.servicios;

import java.io.IOException;
import java.util.*;
import javax.ws.rs.*;
import com.ws.ios.dominio.*;
import com.google.gson.Gson;

@Path("/WebService")
public class ServiciosPublicados {	
	private Gson gson = null;
	private MyBatisSessionFactory sf;
	
	public ServiciosPublicados() {
		this.sf = new MyBatisSessionFactory();
		this.gson = new Gson();
		
		if (sf == null) {
			System.out.println("Error al iniciar el session factory");
		}
		
		try {
			if (sf.getSessionFactory() == null) {
				System.out.println("Error al cargar el session factory");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@GET
	@Path("/GetPermisos")
	@Produces("application/json")
	public String getPermisos() {
		String permisos  = null;
		ArrayList<Permiso> listPermisos = null;

		try {			
			PermisoService permisoService = new PermisoService(sf.getSessionFactory());
			listPermisos = permisoService.getPermisos();			
			permisos = gson.toJson(listPermisos);
		} 
		catch (Exception e) {
			System.out.println("Error al obtener el listado de permisos");
		}
		
		return permisos;
	}
	
	@GET
	@Path("/GetPersonas")
	@Produces("application/json")
	public String getPersonas() {
		String personas  = null;
		ArrayList<Persona> listPersonas = null;
		
		try {
			PersonaService personaService = new PersonaService(sf.getSessionFactory());
			listPersonas = personaService.getPersonas();
			personas = gson.toJson(listPersonas);
		} 
		catch (Exception e) {
			System.out.println("Error al obtener el listado de personas");
		}
		
		return personas;
	}
	
	@GET
	@Path("/GetRolPermisos")
	@Produces("application/json")
	public String getRolPermisos() {
		String rolPermisos  = null;
		ArrayList<RolPermiso> listRolPermisos = null;
		
		try {
			RolPermisoService rolPermisoService = new RolPermisoService(sf.getSessionFactory());
			listRolPermisos = rolPermisoService.getRolPermisos(1);
			rolPermisos = gson.toJson(listRolPermisos);
		} 
		catch (Exception e) {
			System.out.println("Error al obtener el listado de permisos por rol");
		}
		
		return rolPermisos;
	}
	
	@GET
	@Path("/GetRoles")
	@Produces("application/json")
	public String getRoles() {
		String roles  = null;
		ArrayList<Rol> listRoles = null;
		
		try {
			RolService rolService = new RolService(sf.getSessionFactory());
			listRoles = rolService.getRoles();
			roles = gson.toJson(listRoles);
		} 
		catch (Exception e) {
			System.out.println("Error al obtener el listado de roles");
		}
		
		return roles;
	}
	
	@GET
	@Path("/GetTiposUsuario")
	@Produces("application/json")
	public String getTiposUsuario() {
		String tiposUsuario  = null;
		ArrayList<TipoUsuario> listTiposUsuario = null;
		
		try {
			TipoUsuarioService tipoUsuarioService = new TipoUsuarioService(sf.getSessionFactory());
			listTiposUsuario = tipoUsuarioService.getTiposUsuario();
			tiposUsuario = gson.toJson(listTiposUsuario);
		} 
		catch (Exception e) {
			System.out.println("Error al obtener el listado de tipos de usuario");
		}
		
		return tiposUsuario;
	}
	
	@GET
	@Path("/GetUsuarioPermisosEspeciales")
	@Produces("application/json")
	public String usuarioPermisosEspeciales() {
		String permisosEspeciales  = null;
		ArrayList<UsuarioPermisoEspecial> listUsuarioPermisosEspeciales = null;
		
		try {
			UsuarioPermisoEspecialService usuarioPermisoEspecialService = new UsuarioPermisoEspecialService(sf.getSessionFactory());
			listUsuarioPermisosEspeciales = usuarioPermisoEspecialService.getUsuarioPermisosEspeciales(1);
			permisosEspeciales = gson.toJson(listUsuarioPermisosEspeciales);
		} 
		catch (Exception e) {
			System.out.println("Error al obtener el listado de permisos especiales por usuario");
		}
		
		return permisosEspeciales;
	}
	
	@GET
	@Path("/GetUsuarioPermisosExcluidos")
	@Produces("application/json")
	public String usuarioPermisosExcluidos() {
		String permisosExcluidos  = null;
		ArrayList<UsuarioPermisoExcluido> listUsuarioPermisosExcluidos = null;
		
		try {
			UsuarioPermisoExcluidoService usuarioPermisoExcluidoService = new UsuarioPermisoExcluidoService(sf.getSessionFactory());
			listUsuarioPermisosExcluidos = usuarioPermisoExcluidoService.getUsuarioPermisosExcluidos(1);
			permisosExcluidos = gson.toJson(listUsuarioPermisosExcluidos);
		} 
		catch (Exception e) {
			System.out.println("Error al obtener el listado de permisos excluidos por usuario");
		}
		
		return permisosExcluidos;
	}
	
	@GET
	@Path("/GetUsuarioRoles")
	@Produces("application/json")
	public String getUsuarioRoles() {
		String usuarioRoles  = null;
		ArrayList<UsuarioRol> listUsuarioRoles = null;
		
		try {
			UsuarioRolService usuarioRolService = new UsuarioRolService(sf.getSessionFactory());
			listUsuarioRoles = usuarioRolService.getUsuarioRoles(1);
			usuarioRoles = gson.toJson(listUsuarioRoles);
		} 
		catch (Exception e) {
			System.out.println("Error al obtener el listado de roles por usuario");
		}
		
		return usuarioRoles;
	}
	
	@GET
	@Path("/GetUsuarios")
	@Produces("application/json")
	public String getUsuarios() {
		String usuarios  = null;
		ArrayList<Usuario> listUsuarios = null;
		
		try {
			UsuarioService usuarioService = new UsuarioService(sf.getSessionFactory());
			listUsuarios = usuarioService.getUsuarios();
			usuarios = gson.toJson(listUsuarios);
		} 
		catch (Exception e) {
			System.out.println("Error al obtener el listado de usuarios");
		}
		
		return usuarios;
	}
}
