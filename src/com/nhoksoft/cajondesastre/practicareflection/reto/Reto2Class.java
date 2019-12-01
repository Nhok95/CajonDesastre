package com.nhoksoft.cajondesastre.practicareflection.reto;

//import java.util.Date;

public class Reto2Class {

	public static void main(String[] args) {
		
		RandomMethodExecutor rme = new RandomMethodExecutor();
		try {
			//Foo foo = new Foo();
			rme.execute(new TestObject1());
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
		}
		

	}

}