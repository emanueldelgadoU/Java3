package Practica3;



public class Ejercicio111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=5;
		
		for (int i=1; i<=n; i++) {
			
			for (int j=i; j<=n-1; j++) {

				System.out.print(" ");		
			}	
			
				for (int j=1; j<=i-1; j++) {

					System.out.print("*");	
				}
				
				for (int j=1; j<=i-1; j++) {

					System.out.print("*");	
				}
				
				System.out.println("*");
			}
			
		
		}

		
		
	}

