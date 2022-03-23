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
	
public static void buscarEspañol(String []español, String []ingles, String palabra ) {
		
	for (int i = 0; i < español.length; i++) {
		if (español[i].equalsIgnoreCase(palabra)) { //Comparo palabra
			
			System.out.println(ingles[i]); //Imprimo el vectorcontrario
		}
	}
	
}

public static void buscaringles(String []ingles, String []español, String palabra ) {
	
	for (int i = 0; i < ingles.length; i++) {
		if (ingles[i].equalsIgnoreCase(palabra)) { //Comparo palabra
			
			System.out.println(español[i]); //Imprimo el vectorcontrario
		}
	}
	
}
				

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	String [] español = new String [20];
	String [] ingles = new String [20];
	
	español[0]="uno";
	español[1]="dos";
	español[2]="tres";
	español[3]="cuatro";
	español[4]="cinco";
	español[5]="seis";
	español[6]="siete";
	español[7]="ocho";
	español[8]="nueve";
	español[9]="diez";
	español[10]="unoo";
	español[11]="doss";
	español[12]="tress";
	español[13]="cuatroo";
	español[14]="cincoo";
	español[15]="seiss";
	español[16]="sietee";
	español[17]="ochoo";
	español[18]="nuevee";
	español[19]="diezz";
	
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
	    buscarEspañol(español, ingles, palabra);
	    
	    break;
	    
	  case 2:
		System.out.println("Give me a word to translate into Spanish");
		  palabra=teclado.nextLine();
		  buscaringles(ingles, español, palabra);
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
