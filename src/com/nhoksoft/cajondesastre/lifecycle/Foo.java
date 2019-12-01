package com.nhoksoft.cajondesastre.lifecycle;

import java.util.HashMap;
import java.util.Map;

public class Foo {
	
	private static int v1;
	private static Map<Integer, String> mapa = new HashMap<Integer, String>();
	
	static {
		System.out.println("dentro del bloque de inicializaci�n est�tico");
		mapa.put(v1,"cien");
	}
	
	public Foo() {
		System.out.println("constructor de Foo");
	}
	
	{
		System.out.println("bloque pululante 1");
	}
	
	static {
		System.out.println("bloque est�tico 2");
	}

}
