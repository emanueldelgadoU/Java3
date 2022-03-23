package AlquilerPeliculas;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/////////////////////////////////////////////////////////////////////////
		PrimeVideo p1 = new PrimeVideo();
		
		p1.getGanancias();
		
		
		for (int i = 0; i < 1000; i++) {
			if (i<250) {
				String a = i+"";
				p1.suscriptores.add(new ClientePrime(a,""));
			}
			if (i>250) {
				String a = i+"";
				p1.suscriptores.add(new ClientePrimePro(a,""));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
