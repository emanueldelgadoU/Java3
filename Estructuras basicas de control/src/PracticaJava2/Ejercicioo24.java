package PracticaJava2;

import java.util.Scanner;

public class Ejercicioo24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Programa que lea números enteros entre 1 y 100 y para cada uno de ellos escriba su mayor divisor
	//distinto del propio número. Se terminará el programa cuando lea el número cero. Al final se escribirá la
	//cantidad de números correctos introducidos (entre 1 y 100) y el número de errores cometidos (números
	//fuera de los permitidos). Ejemplo:
		
	
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero para saber sus divisores");
		
		int numero=0;
		int contador=0;
		int mayor=0;
		
		
		do {
			numero = teclado.nextInt();
			
			for (int i=1; i<=numero-1; i++) {
				
				if (numero%i==0) {
			
					if (numero>mayor) {
						mayor=numero;
					}
				}
				
			}	
			
			System.out.println("El mayor es divisible es"+ mayor );
			
			
			
			
			
		} while (numero!=0);
		
		
		
		
		
		
		
		
		
	}

}
