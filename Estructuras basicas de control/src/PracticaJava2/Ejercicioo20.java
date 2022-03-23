package PracticaJava2;

import java.util.Scanner;

public class Ejercicioo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero para saber sus divisores");
		numero = teclado.nextInt();
		
	for (int i=1; i<=numero-1; i++) {
			
			if (numero%i==0) {
		
				System.out.println(i);
			}	
		}

	
	
	
	
	}
}
