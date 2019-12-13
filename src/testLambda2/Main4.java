package testLambda2;

public class Main4 {
	public static void main(String[] args) {
		Moto moto = new Moto();
		
		moto.impenniamo( ()->{System.out.println("impennata spaziale!");} );
	}
}
