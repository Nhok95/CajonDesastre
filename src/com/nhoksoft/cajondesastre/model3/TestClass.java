package com.nhoksoft.cajondesastre.model3;

import java.util.Date;

public class TestClass {

	public static void main(String[] args) {
		
		Perro p1 = new Perro();
		
		p1.setCodigo(12332);
		p1.setNombre("Firulais");
		p1.setFechaNacimiento(new Date());
		
		System.out.println(p1);

	}

}
