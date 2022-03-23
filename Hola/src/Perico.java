
public class Perico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letra='J';
		char letra2='j';
		
		
		
		System.out.println((int) letra);
		System.out.println((int) letra2);
			
		String mensaje = "hola mundo";
		
		System.out.println("longitud de la cadena" + mensaje.length());
		System.out.println("Caracter en la posicion 2 " + mensaje.charAt(3));
		System.out.println("Posicion de la submadena 'mu'"+mensaje.indexOf("mu"));
		
		
		
		//Saber si una subcadena esta dentro de la unacadena
		
		String c1= "En un lugar de la Mancha de cyo nombre no quiero...";
		String sub = "Mancha";
		System.out.println(c1.indexOf(sub));
		
		if (c1.toLowerCase(sub)>=0) {
			
			
			System.out.println("Si esta");
		}
		else {
			System.out.println("No esta");
		}
		
		
		
		
	}

}
