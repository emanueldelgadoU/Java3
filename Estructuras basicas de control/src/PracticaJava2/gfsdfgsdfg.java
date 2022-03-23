package PracticaJava2;

import java.util.Scanner;

public class gfsdfgsdfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=0;
		int mayor=0;
		Scanner teclado = new Scanner(System.in);
		
		numero = teclado.nextInt();
		
	for (int i=1; i<=numero-1; i++) {
			
			if (numero%i==0) {
				
				System.out.println(i);
				
				if (i>mayor) {
					mayor=i;
					
				}
		
				System.out.println("El numero es " + mayor);
			}	
		}
		
	
		
		
	}

}
