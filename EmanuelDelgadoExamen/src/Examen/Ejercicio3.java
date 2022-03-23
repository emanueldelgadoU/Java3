package Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

public static void llenarMatriz(int [][] vector) {
		
		for(int i=0; i<=vector.length-1; i++) {
			
			for(int j=0; j<=vector[0].length-1; j++) {
				
			vector[i][j] = (int) (Math.random()*100)+1; 	
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


public static void burbuja(int vector[]) {
	int aux=0;
	for(int i=0; i<vector.length; i++) {
		for(int j=0; j<vector.length-1; j++) {
			if (vector[j] < vector[j+1]) {
				aux = vector[j];
				vector[j] = vector[j+1];
				vector[j+1] = aux;
			}
		}
	}		
}

public static void ordenarFilas(int [][] vector) {
		
	for(int i=0; i<=vector.length-1; i++) {
			
		burbuja(vector[i]);
		
		}
	}


public static void sumarFilas(int [][] dimension, int fila) {
	
	int sumaFilas;
	
	for(int i=fila; i<=fila; i++) {
		
		sumaFilas=0;
		
		for(int j=0; j<=dimension[0].length-1; j++) {	
			
		sumaFilas = sumaFilas+dimension[i][j];	
		}
		
		System.out.println("La suma de la fila ["+fila+"] es  " +sumaFilas );
	}
}


public static void sumarColumna(int [][] matriz, int columna) {
	
	int sumaC;
	
	for(int j=0; j<matriz[0].length; j++) {
		
		sumaC = 0;
		for(int i=0; i<matriz.length; i++) {
			sumaC += matriz[i][j];
		}
		
		System.out.println("La suma de la columna "+ j +" es " + sumaC);
	}
}






public static void diagonal(int [][] vector) {
	
	int acumulador=0;
	
	for(int i=0; i<=vector.length-1; i++) {
		
		for(int j=0; j<=vector[0].length-1; j++) {	
			
			if (vector[i]==vector[j]) {
				
			 acumulador=acumulador + vector[i][j];
			}
		}
	}
	 System.out.println("diagonal principal "+ acumulador);
	 
	 for(int i=0; i<=vector.length-1; i++) {
			
			for(int j=0; j<=vector[0].length-1; j++) {	
				
				if (vector[i]==vector[j]) {
					
				 acumulador=acumulador + vector[i][j];
				}
			}
		}
		 System.out.println("diagonal principal "+ acumulador);
}
	
public static void media (int [][] vector) {
	
	int suma = 0;
	
	for(int i=0; i<=vector.length-1; i++) {
	
		for(int j=0; j<=vector[0].length-1; j++) {
		
			suma=suma+vector[i][j];			
		}
	}
	System.out.println( " La media es  "+suma/vector.length*2);
}

public static int [][] matrizTranspuesta(int matriz[][], int matrizNueva[][]) {

    for (int i=0; i<matriz.length; i++) {
        for (int j=0; j<matriz[i].length; j++) {
            matrizNueva[j][i] = matriz[i][j];
        }
    }
    return matrizNueva;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matriz = new int [5][5];
		int [][] matrizNueva = new int [5][5];
		
		llenarMatriz(matriz);
		mostrarVector(matriz);
		
		
		
	int columna;
	int fila;
	int opcion;	
	try {

		Scanner teclado = new Scanner(System.in);

		do {
		
			System.out.println("=================");
			System.out.println("1-Suma de una fila que se pedirá al usuario");
			System.out.println("2-Suma de una columna que se pedirá al usuario ");	
			System.out.println("3-Sumar la diagonal principal y la diagonal inversa, y mostrar las dos sumas ");	
			System.out.println("4-La media de todos los valores de la matriz");	
			System.out.println("5-Pinta la matriz traspuesta ");	
			System.out.println("6-Muestra la matriz con las filas ordenadas de mayor a menor ");
			System.out.println("7-Salir");
		
			opcion=Integer.parseInt(teclado.nextLine());
		
		
			switch (opcion) {
		
				case 1:
					System.out.println("Eligue una fila para sumar");
					fila=Integer.parseInt(teclado.nextLine());
					sumarFilas(matriz, fila);
					break;
					
				case 2:
					System.out.println("Eligue una columna para sumar");
					columna=Integer.parseInt(teclado.nextLine());
					sumarColumna(matriz, columna);
					break;
					
				case 3:	
					diagonal(matriz);
					break;
					
				case 4:
					media(matriz);
					break;

				case 5:
					matrizTranspuesta(matriz, matrizNueva);
					mostrarVector(matrizNueva);
					
					break;

				case 6:
					ordenarFilas(matriz);
					mostrarVector(matriz);
					break;
			}
		
		} while (opcion!=7);

			teclado.close();
	} catch (InputMismatchException e) {
			System.out.println("Tiene que ser un numero entero");
			}
	
	
	}

}
		
		
