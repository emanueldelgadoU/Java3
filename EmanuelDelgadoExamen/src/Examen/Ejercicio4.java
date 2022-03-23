package Examen;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Ejercicio4 {

public static void llenarMatriz(int [][] vector) {
		
		for(int i=0; i<=vector.length-1; i++) {
			
			for(int j=0; j<=vector[0].length-1; j++) {
				
			vector[i][j] = 5; 	
			}
		}
	}

public static void mostrarVector(int [][] vector) {
	
	
	for(int i=0; i<=vector.length-1; i++) {
		
		for(int j=0; j<=vector[0].length-1; j++) {	
			
		System.out.print(vector[i][j]+ " ");
		
		}
		
		System.out.println(" ");
	}
}

public static double pedirGasolina(String[][] nombresGolosinas, int [][] unidades, String pedir, double[][] precio ) {
	
	int posicion1 = pedir.charAt(0);
	int posicion2 = pedir.charAt(1);
	
	double preciofinal = precio[posicion1][posicion2] ;
	
	for (int i = posicion1; i <= posicion1; i++) {
		for (int j = posicion2; j <= posicion2; j++) {
	
		}
	}
	
	unidades[posicion1][posicion2]-=1;
	return preciofinal;
}


public static void mostrar(String[][] nombresGolosinas, int [][] unidades, double[][] precio) {
	
	
	for (int i = 0; i < nombresGolosinas.length; i++) {
		for (int j = 0; j < precio.length; j++) {
			System.out.print("nombre "+nombresGolosinas[i][j]+" ");
			System.out.print("cantidad restantes "+unidades[i][j]+" ");
			System.out.print("precio "+precio[i][j]+" ");
			System.out.print("numero a introducir ");
		}
		System.out.println();
	}
	
	
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String[][] nombresGolosinas = {
				{"KitKat", "Chicles fresa", "Lacasitos", "Palotes"},
				{"Kinder Bueno", "Haribo", "Chetoos", "Twix"},
				{"Risketos", "M&M'S", "Mars", "Chicles menta"},
				{"Doritos","Palomitas", "Gusanitos","Lays"} };
	
	
	
	double[][] precio = {
			 {1.1, 0.8, 1.5, 0.9},
			 {1.8, 1, 1.2, 1},
			 {1.8, 1.3, 1.2, 0.8},
			 {1.5, 1.1, 1.1, 1.1}};
	

	
	int [][] unidades = new int [4][4];
		
	llenarMatriz(unidades);	
	
	String pedir;
	int opcion;	
	try {
		
		

	Scanner teclado = new Scanner(System.in);

	int ventas=0;
	
	do {
	

	System.out.println("=================");
	System.out.println("Dime una opcion");
	System.out.println("1-Pedir golosina");	
	System.out.println("2-Mostrar golosina");	
	System.out.println("3-Rellenar golosina");	
	System.out.println("4-Apagar maquina");	
	
	opcion=Integer.parseInt(teclado.nextLine());
	
	
	switch (opcion) {
	  case 1:
	    System.out.println("¿Cual quieres?, introduce numero de dos digitos");
	    pedir=teclado.nextLine();
	    
	    ventas+=pedirGasolina(nombresGolosinas, unidades, pedir, precio);
	    break;
	    
	  case 2:
		  
		System.out.println("");
		mostrar(nombresGolosinas, unidades, precio);
	    break;
	    
	  case 3:
		System.out.println("");
		
		
	    break;
	    
	}
	
	} while (opcion!=4);

	

	
	teclado.close();
	} catch (InputMismatchException e) {
		System.out.println("Tiene que ser un numero entero");
		
	}
	
	
		
	}

}
