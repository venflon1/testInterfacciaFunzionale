package testLambda2;

public class Main3 {
	public static void main(String[] args) {
		Moto moto = new Moto();
		
		moto.impenniamo(new Impenna() {

			@Override
			public void impenna() {
				System.out.println("impennooooooooooooooo!");
			}
			
		});
	}
}
