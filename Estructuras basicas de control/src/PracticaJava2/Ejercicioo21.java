package PracticaJava2;

public class Ejercicioo21 {

	public static boolean primos(int num) {
		
		int numero=num;
		
		for (int i=2; i<=numero-1; i++) {
			
			if (numero%i!=0) {
				return true;	
			}
			else {
				
				return false;
				
			}
		}
		return false;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.out.println(primos());
		
	}

}
