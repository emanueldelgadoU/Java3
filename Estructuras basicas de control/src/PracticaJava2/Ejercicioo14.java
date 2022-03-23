package PracticaJava2;

import java.util.Scanner;

public class Ejercicioo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * Primer bucle columnas
	 * Segundo bucle espacios
	 * Tercer bucles filas
	 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int n = teclado.nextInt();
		
		for (int i=0; i<n; i++) {
			
			for (int j=i; j<n-1; j++) {

				System.out.print(" ");		
			}	
			
				for (int j=0; j<i; j++) {

					System.out.print("*");
					
				}
				System.out.println("*");
			}
			
		
		}

		
		
	}
		
		
		
