package com.nhoksoft.cajondesastre.geometria.model;

public class Triangulo extends Poligono {

	public Triangulo(Punto a, Punto b, Punto c) {
		super(a,b,c);
	}
	
	@Override
	public double getArea() {
		//F�rmula de Her�n
		double d1 = vertices[0].distancia(vertices[1]);
		double d2 = vertices[1].distancia(vertices[2]);
		double d3 = vertices[2].distancia(vertices[0]);
		double s = (d1+d2+d3)/2; //semiper�metro
		
		return Math.sqrt(s*(s-d1)*(s-d2)*(s-d3));
	}

}
