package com.nhoksoft.cajondesastre.classesanonimas;

public class TestClass {

	public static void main(String[] args) {
		
		// Necesito un ejecutable
		
		Ejecutable ejecutable = new Ejecutable() {

			@Override
			public void run() {
				System.out.println("clase anónima!");
			}
			
		};
		
		ejecutable.run();
		
		System.out.println("Rn".compareTo("Sn"));

	}

}
