package com.nhoksoft.cajondesastre.geometria.model;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public void trasladar(double deltaX, double deltaY) {
		x += deltaX;
		y += deltaY;
	}
	
	public double distancia(Punto otro) {
		return Math.sqrt( Math.pow(otro.x - x, 2) + Math.pow(otro.y - y, 2));
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

}
