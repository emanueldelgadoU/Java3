package PracticaJava2;

import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		Scanner teclado = new Scanner(System.in);

		
		
		int i=0;
		do {
			
			System.out.println("Escribe un numero");
			numero = teclado.nextInt();
			
			i++;
			System.out.println(i);
			
			
		} while (numero!=10);
		
	}

}
