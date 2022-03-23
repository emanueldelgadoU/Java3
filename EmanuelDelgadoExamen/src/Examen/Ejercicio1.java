package Examen;

public class Ejercicio1 {



	public static double factorial(int n) {
		int fact = 1;
		
		if(n==0) {
		fact=1;
		return fact;		
		}

		for(int i=1; i<=n; i++)
			
			fact *= i;
		
		return fact;
	}
	
	public static void main(String[] args) {
		

		double totalAnterior = 0;
		double total = 0;
		double diferencia = 1;
		
		int i=0;
		
		do {
			
			total = total+ (1 / factorial(i)) ;
			diferencia = (total - totalAnterior);
			
			totalAnterior = total;			
			i++;	
			
		} while (Math.abs(diferencia) >   0.000000001);
		
		System.out.println(total);
		
		

	}

	    
}