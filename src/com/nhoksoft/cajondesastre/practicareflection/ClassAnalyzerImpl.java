package com.nhoksoft.cajondesastre.practicareflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassAnalyzerImpl implements ClassAnalyzer {

	@Override
	public void analyze(Object object) { //el objeto que recibamos lo trataremos como un object
		Class<?> c = object.getClass();
		
		System.out.println("Class Name: " + c.getCanonicalName());
		System.out.println("Simple Class Name: " + c.getSimpleName());
		
		System.out.println("Package: " +  c.getPackage());
		
		System.out.println("");
		
		Method m[] = c.getMethods();
		System.out.println("Methods {");
		for (int i = 0; i < m.length; i++) {
			System.out.println("	"  + m[i].getName());
		}
		System.out.println("}");
		
		Method m2[] = c.getDeclaredMethods();
		
		System.out.println("Declared Methods {");
		for (int i = 0; i < m2.length; i++) {
			System.out.println("	"  + m2[i].getName());
		}
		System.out.println("}");
		
		Constructor<?>[] constr = c.getConstructors();
		
		System.out.println("Constructors {");
		for (int i = 0; i < constr.length; i++) {
			System.out.println("	"  + constr[i].getName());
		}
		System.out.println("}");
		
		System.out.println(); 
		
		
		//TypeVariable<object.getClass().getSimpleName()>[] typeVariable = c.getTypeParameters();
		//System.out.println(typeVariable.length);

	}

}
