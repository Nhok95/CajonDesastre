package com.nhoksoft.cajondesastre.herencia1;

public class Taxista extends Persona {
	
	private String licencia;
	
	public Taxista() {
		System.out.println("contructor de Taxista");
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	@Override
	public String toString() {
		return "Taxista [licencia=" + licencia + ", toString()=" + super.toString() + "]";
	}
	
	
}
