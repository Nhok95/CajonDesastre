package com.nhoksoft.cajondesastre.polimorfismo;

public class TestClass {

	public static void main(String[] args) {
		
		Deportista d2 = new Ciclista();
		
		d2.entrenar();
		d2.competir();
		
		Deportista d3 = new Futbolista();
		
		d3.entrenar();
		d3.competir();

	}

}
