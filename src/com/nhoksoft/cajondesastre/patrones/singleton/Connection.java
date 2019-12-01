package com.nhoksoft.cajondesastre.patrones.singleton;

public class Connection {
	
	private static Connection INSTANCE = null;
	
	private Connection() {}
	
	public synchronized static Connection getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Connection();
		}
		return INSTANCE;
	}
}
