import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//.Programa que lea un número positivo y muestre por pantalla la lista de números impares desde 2 hasta el
	//número leído.
		
		
		int num, i;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero");
		num=teclado.nextInt();
		
		for (i=2; i<=num; i++)  {
			
			if (!(i%2==0)) {
				System.out.println(i);
				
			};
			
		}
		

		
		
	}

}
