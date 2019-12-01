package com.nhoksoft.cajondesastre.practicarandomgroups;

import java.util.List;
import java.util.Map;

public class TestClass {

	public static void main(String[] args) {
		
		GroupsGenerator groupsGenerator = new GroupsGeneratorImplNhok();
		
		try {
			
		//	Map<String, List<String>> grupos = groupsGenerator.generate(2, "GRUPO", "m1","m2","m3","m4","m5");
		//	Map<String, List<String>> grupos = groupsGenerator.generate(2, "GRUPO", "m1","m2","m3","m4","m5");
		//	Map<String, List<String>> grupos = groupsGenerator.generate(2, "GRUPO", "m1","m2","m3","m4","m5");
			Map<String, List<String>> grupos = groupsGenerator.generate(2, "grupo", 
					"m1","m2","m3","m4","m5","m7","m8","m9","m10","m11");
		//	Map<String, List<String>> grupos = groupsGenerator.generate(2, "GRUPO", "m1","m2","m3","m4","m5");
			for (String key: grupos.keySet()) {
				System.out.println("key: " + key);
				
				System.out.println(grupos.get(key));
			}
		
		} catch(Exception e) {
			System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
		}
		
		//TODO mostrar resultado por consola...
		
	}

}
