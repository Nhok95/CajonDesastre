package com.nhoksoft.cajondesastre.polimorfismo;

public class Ciclista implements Deportista {

	@Override
	public void entrenar() {
		System.out.println("ciclista entrenando de forma espec�fica");
	}

	@Override
	public void competir() {
		System.out.println("ciclista compitiendo a su manera");
	}
	
	

}
