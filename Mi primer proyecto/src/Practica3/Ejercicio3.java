package Practica3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero");
		numero = teclado.nextInt();
		
		
		switch(numero) {
		case 1: 
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		case 4:
			System.out.println("Cuatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		case 6: 
			System.out.println("Seis");
			break;
		case 7:
			System.out.println("Siete");
			break;
		case 8:
			System.out.println("Ocho");
			break;
		case 9:
			System.out.println("Nueve");
			break;
		default:
			System.out.println("No es un numero de entero de un digito");
			break;
		}
		
	}
}
