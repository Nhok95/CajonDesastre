package com.nhoksoft.cajondesastre.mundoestatico;

public class TestClass {

	public static void main(String[] args) {
		
		System.out.println("Vida media de los gatos: " + Gato.VIDA_MEDIA);
		
		@SuppressWarnings("unused")
		Gato g1 = new Gato(100,"Tobias");

	}

}
