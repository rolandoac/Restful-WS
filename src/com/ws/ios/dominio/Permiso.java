package com.ws.ios.dominio;

public class Permiso {
	private int idPermiso;
	private String clave, nombre, descripcion;
	private int idPermisoPadre;

	public Permiso () {

	}

	public int getIdPermiso() {
		return idPermiso;
	}

	public void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdPermisoPadre() {
		return idPermisoPadre;
	}

	public void setIdPermisoPadre(int idPermisoPadre) {
		this.idPermisoPadre = idPermisoPadre;
	}
}
