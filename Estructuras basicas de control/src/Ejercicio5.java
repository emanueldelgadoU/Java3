import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Programa que pida al usuario un número repetidamente hasta que el número introducido esté entre 1 y
	//10
		int num;
		Scanner teclado = new Scanner(System.in);

		
		do {
		
		System.out.println("Escribe un numero del 1 al 10 o se repetira");	
		num=teclado.nextInt();
			
		} while (num<1 || num>10);
		System.out.println("El numero es " + num +" Fin del programa");
		
	}

}
