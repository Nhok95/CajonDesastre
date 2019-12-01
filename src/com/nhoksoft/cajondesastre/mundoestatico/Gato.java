package com.nhoksoft.cajondesastre.mundoestatico;

public class Gato {
	
	public static final double VIDA_MEDIA = 8.4;
	
	private int codigo;
	private String nombre;
	
	
	public Gato() {}
	
	public Gato(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Gato [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
}
