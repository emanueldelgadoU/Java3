package Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void mostrarArray(int[]array) {
		
		for(int i=0; i<=array.length-1; i++) {
				System.out.print(array[i]+" ");
		}
		
		System.out.println("");
	}
	
public static void buscarEspa�ol(String []espa�ol, String []ingles, String palabra ) {
		
	for (int i = 0; i < espa�ol.length; i++) {
		if (espa�ol[i].equalsIgnoreCase(palabra)) { //Comparo palabra
			
			System.out.println(ingles[i]); //Imprimo el vectorcontrario
		}
	}
	
}

public static void buscaringles(String []ingles, String []espa�ol, String palabra ) {
	
	for (int i = 0; i < ingles.length; i++) {
		if (ingles[i].equalsIgnoreCase(palabra)) { //Comparo palabra
			
			System.out.println(espa�ol[i]); //Imprimo el vectorcontrario
		}
	}
	
}
				

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	String [] espa�ol = new String [20];
	String [] ingles = new String [20];
	
	espa�ol[0]="uno";
	espa�ol[1]="dos";
	espa�ol[2]="tres";
	espa�ol[3]="cuatro";
	espa�ol[4]="cinco";
	espa�ol[5]="seis";
	espa�ol[6]="siete";
	espa�ol[7]="ocho";
	espa�ol[8]="nueve";
	espa�ol[9]="diez";
	espa�ol[10]="unoo";
	espa�ol[11]="doss";
	espa�ol[12]="tress";
	espa�ol[13]="cuatroo";
	espa�ol[14]="cincoo";
	espa�ol[15]="seiss";
	espa�ol[16]="sietee";
	espa�ol[17]="ochoo";
	espa�ol[18]="nuevee";
	espa�ol[19]="diezz";
	
	ingles[0]="one";
	ingles[1]="two";
	ingles[2]="three";
	ingles[3]="four";
	ingles[4]="five";
	ingles[5]="six";
	ingles[6]="seven";
	ingles[7]="eigth";
	ingles[8]="nine";
	ingles[9]="ten";
	ingles[10]="one";
	ingles[11]="two";
	ingles[12]="three";
	ingles[13]="four";
	ingles[14]="five";
	ingles[15]="six";
	ingles[16]="seven";
	ingles[17]="eigth";
	ingles[18]="nine";
	ingles[19]="ten";


	
	String palabra;
	int opcion;	
	try {
		
		

	Scanner teclado = new Scanner(System.in);

	
	
	do {
	

	System.out.println("=================");
	System.out.println("Dime una opcion");
	System.out.println("1-ES a EN");	
	System.out.println("2-EN a ES ");	
	System.out.println("3-Salir");	
	
	
	opcion=Integer.parseInt(teclado.nextLine());
	
	switch (opcion) {
	  case 1:
	    System.out.println("Dime una palabra para traducirla al ingles");
	    palabra=teclado.nextLine();
	    buscarEspa�ol(espa�ol, ingles, palabra);
	    
	    break;
	    
	  case 2:
		System.out.println("Give me a word to translate into Spanish");
		  palabra=teclado.nextLine();
		  buscaringles(ingles, espa�ol, palabra);
	    break;
	    
	  case 3:
		System.out.println("salir");
	    break;
	}
	
	} while (opcion!=3);

	

	
	teclado.close();
	} catch (InputMismatchException e) {
		System.out.println("Tiene que ser un numero entero");
		
	}
	
	
		
	}

}
