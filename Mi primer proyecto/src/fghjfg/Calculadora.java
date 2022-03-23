package fghjfg;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int opcion=0;
		double a=0;
		double b=0;
		
		do {
		
				System.out.println("=================");
				System.out.println("1- SUMAR");
				System.out.println("2- RESTAR");
				System.out.println("3- MULTIPLICAR");
				System.out.println("4- DIVIDIR");
				System.out.println("=================");
				System.out.println("");
				System.out.println("Escribir una opcion");
				
				Scanner teclado = new Scanner(System.in);
				try {
					opcion = Integer.parseInt(teclado.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("No has introducido una opción válida");
				}
				
				
				System.out.println("Escribir el valor de A");
				a = Double.parseDouble(teclado.nextLine());
				
				System.out.println("Escribir el valor de B");
				b = Double.parseDouble(teclado.nextLine());
				
				switch(opcion) {
					case 1: 
						System.out.println("La suma es " + (a+b));
						break;
					case 2:
						System.out.println("La resta es " + (a-b));
						break;
					case 3:
						System.out.println("La multiplicacion es " +(a*b));
						break;
					case 4:
						System.out.println("La division es " + (a/b));
						break;
					case 5:
						System.out.println("Fin del programa");
						break;
				}
		
		} while(opcion!=5);
		
		
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
