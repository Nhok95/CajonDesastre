package com.nhoksoft.cajondesastre.geometria.model;

public class Circulo implements Figura {

	private Punto centro;
	private double radio;
	
	public Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}
	
	public Circulo(double x, double y, double radio) {
		this.centro = new Punto(x,y);
		this.radio = radio;
	}
	
	public Punto getCentro() {
		return centro;
	}

	public double getRadio() {
		return radio;
	}

	@Override
	public void trasladar(double deltaX, double deltaY) {
		this.centro.trasladar(deltaX, deltaY);
	}

	@Override
	public double getPerimetro() {
		return 2*Math.PI*radio;
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(radio,2);
	}

	@Override
	public String toString() {
		return "Circulo [centro=" + centro + ", radio=" + radio + "]";
	}
	
}
