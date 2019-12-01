package com.nhoksoft.cajondesastre.geometria.model;

public class Cuadrado extends Poligono {

	public Cuadrado(Punto v1, Punto v3) {
		super(v1,null,v3,null);
		
		Punto midpoint = new Punto((v1.getX()+v3.getX())/2.0, (v1.getY()+v3.getY())/2.0); 
 		
		double[] vector = {v3.getX()-midpoint.getX(), v3.getY()-midpoint.getY()};
		
		Punto v2 = new Punto(midpoint.getX() + vector[1], midpoint.getY() - vector[0]);
		Punto v4 = new Punto(midpoint.getX() - vector[1], midpoint.getY() + vector[0]);
		
		this.vertices[1] = v2; 
		this.vertices[3] = v4; 
	}
	
	@Override
	public double getArea() {
		return (Math.pow(vertices[0].distancia(vertices[2]), 2))/2;
	}

}
