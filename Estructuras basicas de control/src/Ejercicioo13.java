import java.util.Scanner;

public class Ejercicioo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int n = teclado.nextInt();
		
		for (int i=0; i<n; i++) {
			
			
				for (int j=0; j<i; j++) {

					System.out.print("*");
					
				}
				System.out.println("*");
			}
			
		
		}

		
		
	}
		
		
		
