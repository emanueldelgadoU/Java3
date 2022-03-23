package PracticaJava2;

import java.util.Scanner;



public class Ejercicioo19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner teclado = new Scanner(System.in);
		
			int numero=0;
			int acumulador=0;
			int contadorNum=0;
			
		do {
			
			System.out.println("Escribe un numero, o escribe -1");
			numero = teclado.nextInt();
			
			if (numero==-1) {
				break;
				
				} else {
					contadorNum++;
					acumulador=acumulador+numero;
			}
			

			
		
		} while (numero!=-1);
		
		System.out.println("La suma de los numeros es "+ acumulador);
		System.out.println("El total de numeros escritos es "+ contadorNum);
		System.out.println("La media es " + acumulador/contadorNum);
	}

}
