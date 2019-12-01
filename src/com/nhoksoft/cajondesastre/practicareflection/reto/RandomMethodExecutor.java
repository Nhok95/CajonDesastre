package com.nhoksoft.cajondesastre.practicareflection.reto;

import java.lang.reflect.Method;
import java.util.Random;

public class RandomMethodExecutor {

	
	public void execute(Object object) throws Exception {
		
		// TODO Ejecutar algun metodo del objeto entrante.
		Class<?> clase = object.getClass();
		Method[] methods = clase.getDeclaredMethods();
		/*
		for (Method m:methods) {
			System.out.println("method: " + m.getName() );
		}
		*/
		int indice = new Random().nextInt(methods.length);
		System.out.println("method: " + methods[indice].getName());
		
		if (methods[indice].getParameterCount() == 0) {
			
			Object output = methods[indice].invoke(object, (Object[]) null);
			
			if (output != null) {
				System.out.println(output);
			} else {
				System.out.println("The method is void");
			}
			
		} else {
			throw new Exception("The method has parameters");
		}
		
	}
	
	
}