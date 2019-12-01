package com.nhoksoft.cajondesastre.practicareflection;

//import java.util.Date;

public class TestClass {

	public static void main(String[] args) {
		
		try {
			ClassAnalyzer classAnalyzer = new ClassAnalyzerImpl();
			//Object object = new Date();
			//Object object = new Integer(123);
			//Object object = "Pepin";
			Object object = new ClassAnalyzerImpl();
			
			classAnalyzer.analyze(object);
		} catch (Exception e) {
			
		}
		
		

	}

}
