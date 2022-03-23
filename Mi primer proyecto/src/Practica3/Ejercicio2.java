package Practica3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero");
		num=teclado.nextInt();
		
		if (num%2==0) {
			System.out.println("El numero es multiplo de 2");	
			} 	
		
			else if (num%3==0) {
				System.out.println("El numero es multiplo de 3");
				}
			
			else if (num%5==0) {
				System.out.println("El numero es multiplo de 5");	
				}
		
			else if (num%7==0) {
				System.out.println("El numero es multiplo de 7");	
				}
			else {
				System.out.println("no es multiplo de los siguentes numeros: 2,3,5,7");
			}
	}

}
