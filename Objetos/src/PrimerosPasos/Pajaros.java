package PrimerosPasos;

public class Pajaros {

	//Propiedades
	private int edad;
	private char color;
	
	public void setEdad(int e) {
		edad=e;
		
	}
		
		
	public void pintarEdad () {
		System.out.println(edad);
		
	}
	
	public void setColor (char c) {
		color=c;
		
	}
	
	public void pintarColor () {
		switch (color) {
			case 'v': System.out.println("verde");
				break;
			case 'a': System.out.println("amarillo");
				break;
			case 'g': System.out.println("gris");
				break;
			case 'n': System.out.println("negro");
				break;
			case 'b': System.out.println("blanco");
				break;
			default: System.out.println("Color no establecido");
		}	
	}
}
