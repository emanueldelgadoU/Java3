package PracticaJava2;

import java.util.Scanner;

public class Ejercicioo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);

		int menor=0;
		int mayor=0;
		int numero=0;

		do {
			
			System.out.println("Escribe un numero");
			System.out.println("O puelsa 0 para salir");
			numero = teclado.nextInt();
			
			if (numero==0) {
				break;
			}
			else {
				
				if (numero>mayor) {
					mayor=numero;
				}
				
				menor=numero;
				
				if (numero<menor) {
					menor=numero;
				}			
			}
			
			
		} while (numero!=0);
		
		
		System.out.println("El mayor es " + mayor);
		System.out.println("El menor es " + menor);
		
	}

}
