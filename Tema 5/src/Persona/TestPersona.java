/**
 * 
 */
package Persona;
import java.util.Scanner;
/**
 * @author alumno
 *
 */
public class TestPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Persona p1 = new Persona();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre");
		p1.setNombre(sc.nextLine());
		System.out.println("Edad");
		p1.setEdad(sc.nextInt());
		System.out.println("Sexo");
		p1.setSexo(sc.next());
		
		System.out.println("Peso");
		p1.setPeso(sc.nextDouble());
		System.out.println("Altura");
		p1.setAltura(sc.nextDouble());
		
		System.out.println(p1);
	}
	
	

}
