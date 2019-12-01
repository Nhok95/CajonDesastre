package com.nhoksoft.cajondesastre.polimorfismo;

public class Futbolista implements Deportista {
	
	@Override
	public void entrenar() {
		System.out.println("futbolista llegando a las 11 y haciendo 4 rondos");
	}

	@Override
	public void competir() {
		System.out.println("futbolista compitiendo a su manera");
	}
	
	
}
