
public class Ejercicioo11 {

	
	static int digitos(int numero) {		
		
		int contador=0;
		
		while(numero>0) {
		
	
			numero=numero/10;
			contador++;		
			
			}
			return contador;
		
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(digitos(3000));

	}
}
