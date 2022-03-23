package PracticaJava2;

import java.util.Scanner;

public class Ejercicioo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int numero1 = teclado.nextInt();
		
		System.out.println("Escribe otro numero");
		int numero2 = teclado.nextInt();
		
		int contador=0;
		
		
		for (int i=numero1; i<=numero2; i++) {
			
			if (i%2==0) {
				
				contador++;	
				System.out.print(i+ " " );
				
			}	
			
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Entre los numeros hay " + contador+" numeros pares");
		
		
	}

}
