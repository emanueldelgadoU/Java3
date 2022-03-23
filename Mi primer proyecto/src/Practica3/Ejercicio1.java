package Practica3;

import java.util.Scanner;

public class Ejercicio1 {
	
	
	static int mayor(int a, int b, int c) {
		
		if ((a>b) && (a>c)) 
			return a;
		else if ((b>a) && (b>c)) 
			return b;
		else if ((c>b) && (c>a)) 
			return c;
		else
			return-1;
		
			
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int resultado;
		resultado=mayor(9,9,9);
		System.out.println(resultado);
		System.out.println(mayor(9,9,9));
		
		
		
		
		
		
		
	}

}
