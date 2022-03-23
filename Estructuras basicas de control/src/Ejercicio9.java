import java.util.Iterator;

public class Ejercicio9 {

	static int factorial(int n) {	
		
		int acumulador=1;
		
		for(int i=1; i<=n; i++) {
			
		acumulador=acumulador*i;	
			
		}
		
		return acumulador;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(5));


}
}