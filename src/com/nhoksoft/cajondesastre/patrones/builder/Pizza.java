package com.nhoksoft.cajondesastre.patrones.builder;

public class Pizza {
	
	@SuppressWarnings("unused")
	private String nombre;
	
	boolean dobleQueso;
	boolean pinya;
	boolean champinyones;
	
	// telescopic antipattern
	
	public Pizza() {}
	
	public Pizza (String nombre) {}
	
	public Pizza (String nombre, boolean dobleQueso) {}
	
	public Pizza (String nombre, boolean dobleQueso, boolean pinya) {}
	
	public Pizza (String nombre, boolean dobleQueso, boolean pinya, boolean champinyones) {}
	
	// patron builder
	
	public static class Builder {
	    //required
	    private final String nombre;
	 
	    //optional
	    private boolean dobleQueso = false;
	    private boolean pinya = false;
	    private boolean champinyones = false;
	 
	    public Builder(String nombre) {
	    	this.nombre = nombre;
	    }
	 
	    public Builder addCheese() {
	    	dobleQueso = true;
	    	return this;
	    }
	 
	    public Builder addPepperoni() {
	    	pinya = true;
	    	return this;
	    }
	 
	    public Builder addBacon() {
	    	champinyones = true;
	    	return this;
	    }
	 
	    public Pizza build() {
	      return new Pizza(this);
	    }
	}
	
	private Pizza(Builder builder) {
	    nombre = builder.nombre;
	    dobleQueso = builder.dobleQueso;
	    pinya = builder.pinya;
	    champinyones = builder.champinyones;
	  }

}
