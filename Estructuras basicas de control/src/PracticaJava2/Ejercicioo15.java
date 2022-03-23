package PracticaJava2;

import java.util.Scanner;

public class Ejercicioo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int n = teclado.nextInt();
		
		/**
		 * Primer bulce columnas
		 * Segundo bucle espacios
		 * Tercer bucles fila izquierda
		 * Cuardo bucle fila derecha
		 */
		
		for (int i=0; i<=n-1; i++) {
			
			for (int j=i; j<=n-1; j++) {

				System.out.print(" ");		
			}	
			
				for (int j=0; j<=i-1; j++) {

					System.out.print("*");
				}
				
				for (int j=0; j<=i-1; j++) {

					System.out.print("*");
					
				}
				
				System.out.println("*");
			}
			
		
		}

		
		
	}
		
		
		
		
		
		
		
		

