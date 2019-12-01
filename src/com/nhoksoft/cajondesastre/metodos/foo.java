package com.nhoksoft.cajondesastre.metodos;

public class foo {
	
	// los nombres de los métodos deben ser came case y empezar en minuscula
	// los nombres de los métodos deben ser verbos
	
	public String getSaludo() {
		return "Hola!"; // one-liners
	}
	
	public void imprime(String texto) {
		System.out.println("mensaje: " + texto);
	}
	
	public void doSomething() {
		System.out.println(suma(10,20));
	}
	
	// synchronized: impide que diferentes hilos entren en él de forma concurrente
	// final: no se puede hacer override de este método
	
	private synchronized final int suma(int a, int b) {
		return a + b;
	}
}
