
package PracticaJava2;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Programa que sume los 100 primeros números enteros impares.
		
		int acumulador=0;
		int i;
		
		for(i=1; i<=100; i++) {
			
			if(i%2==1) {
			acumulador=acumulador+i;
				
			}
			
		}
		
		System.out.println(acumulador);
		
		
		
		
		
		
	}

}
