package com.nhoksoft.cajondesastre.geometria.model;

import java.util.Arrays;

public abstract class Poligono implements Figura{

	protected Punto[] vertices;
	
	// varargs
	public Poligono(Punto ...vertices) {
		
		if (vertices.length < 3) {
			throw new IllegalArgumentException("número de vertices inferior a 3");
		}
		
		this.vertices = vertices;
	}
	
	@Override
	public void trasladar(double deltaX, double deltaY) {
		for (int i = 0; i < vertices.length; i++) {
			vertices[i].trasladar(deltaX, deltaY);
		}
	}

	@Override
	public double getPerimetro() {
		double resP = vertices[vertices.length-1].distancia(vertices[0]);
		for (int i = 0; i < vertices.length-1; i++) {
			resP += vertices[i].distancia(vertices[i+1]);
		}
		return resP;
	}

	public Punto[] getVertices() {
		return vertices;
	}

	@Override
	public String toString() {
		return "Poligono [vertices=" + Arrays.toString(vertices) + "]";
	}
	
}
