package PrimerosPasos;

public class TestArma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Arma arma1  = new Arma();
		System.out.println(arma1.getNombre());
		System.out.println(arma1);
		
		Arma arma2 = new Arma("Hacha",20,"fisico");
		System.out.println(arma2);
		
	}

}
