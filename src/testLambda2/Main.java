package testLambda2;

public class Main {
	public static void main(String[] args) {
		Moto moto = new Moto();
		Impennata imp = new Impennata();
		moto.impenniamo(imp);
	}
}

class Impennata implements Impenna{

	@Override
	public void impenna() {
		System.out.println("sto impennandooooooooooooooo!!!!");
	}
	
}
