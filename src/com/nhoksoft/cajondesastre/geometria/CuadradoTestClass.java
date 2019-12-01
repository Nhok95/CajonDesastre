package com.nhoksoft.cajondesastre.geometria;

import com.nhoksoft.cajondesastre.geometria.model.Cuadrado;
import com.nhoksoft.cajondesastre.geometria.model.Triangulo;
import com.nhoksoft.cajondesastre.geometria.model.Punto;

public class CuadradoTestClass {

	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado(new Punto(0.0,0.0), new Punto(10.0,10.0));
		//Cuadrado c1 = new Cuadrado(new Punto(1.0,-1.0), new Punto(3.0,4.0));
		
		System.out.println(c1);
		c1.trasladar(-100.0, -100.0);
		System.out.println(c1);

		System.out.println("area cuadrado: " + c1.getArea());
		System.out.println("perímetro cuadrado: " + c1.getPerimetro());
		
		Triangulo t1 = new Triangulo(new Punto(0.0,0.0),new Punto(0.0,3.0),new Punto(1.0,1.0));
		
		System.out.println(t1);
		System.out.println("area triangulo: " + t1.getArea());
	
	}

}
