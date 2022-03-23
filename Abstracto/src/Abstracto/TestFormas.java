package Abstracto;

public class TestFormas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo c1 = new Circulo(10);
		Triangulo t1 = new Triangulo(10, 20);
		Rectangulo r1 = new Rectangulo(10, 10);
		Cuadrado cu1 = new Cuadrado(10, 10);
		
		
		System.out.println(c1);
		System.out.println(t1);
		System.out.println(r1);
		System.out.println(cu1);
		
		
		System.out.println(c1.area());
		System.out.println(t1.area());
		System.out.println(r1.area());
		
		
		
		
	}

}
