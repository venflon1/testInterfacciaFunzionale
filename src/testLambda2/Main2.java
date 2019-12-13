package testLambda2;

public class Main2 {
	public static void main(String[] args) {
		Moto moto = new Moto();
		Impenna imp = new Impenna() {

			@Override
			public void impenna() {
				System.out.println("super impennataa!!!!   :O");
			}
		
		};
		
		moto.impenniamo(imp);
	}
}
