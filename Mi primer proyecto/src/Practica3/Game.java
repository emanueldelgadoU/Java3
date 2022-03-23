package Practica3;



public class Game {

	
	static int golpeo1(int vidajugador1, int poderJugador2 ) {
		
		return (vidajugador1-poderJugador2);
	}
	
	static int golpeo2(int vidajugador2, int poderJugador1 ) {
		
		return (vidajugador2-poderJugador1);
	}
	
	
	static void vida(int vidajugador1, int poderJugador1); {
		
		(vidajugador2-poderJugador1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int vidajugador1=10;
		int vidajugador2=10;
		int	poderJugador1=1;
		int poderjugador2=1;
		

		
		
		do {
			
			
		System.out.println(golpeo1(vidajugador1,poderjugador2));
		System.out.println(vidajugador1);
		vidajugador1=vidajugador1-poderjugador2;
			
			
		} while (vidajugador1>=0);
		
		System.out.println("uno jugador ha perdido");
		
		
		
	}

}
