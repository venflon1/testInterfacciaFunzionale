package testLambda;

import java.util.Comparator;

public class ComparatorPersona implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getEta()-o2.getEta();
	}
	
}
