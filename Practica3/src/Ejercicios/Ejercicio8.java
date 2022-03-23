import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, i;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero");
		num=teclado.nextInt();	
		
		for(i=1; i<=num; i++) {
		
		System.out.print(i*2+" ");
		System.out.print(i*3);
		System.out.println("");
	}
		
		
		
		
	}

}
