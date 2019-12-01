package com.nhoksoft.cajondesastre.practicareflection.reto;

import java.lang.reflect.Method;

public class Reto1Class {

	public static void main(String[] args) throws Exception {
		
		Foo foo = new Foo();
		
		// RETO: invocar al metodo privado m1() de foo
		Method method = null;
		method = foo.getClass().getDeclaredMethod("hazAlgo",(Class<?>[]) null);
		method.setAccessible(true);
		method.invoke(foo, (Object[]) null);
	}

}
