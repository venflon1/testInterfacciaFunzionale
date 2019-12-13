package testLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {
		Persona p1 = new Persona("Roberto", "Amato",26);
		Persona p2 = new Persona("Fabio", "Amato", 26);
		Persona p3 = new Persona("Alessia Lidia", "Federico", 24);
		Persona p4 = new Persona("Daniele", "Amato", 35);
		
		List<Persona> list = Arrays.asList(p1, p2, p3, p4);
		System.out.println(list);
		Collections.sort(list);	
		System.out.println(list);
	}
}
