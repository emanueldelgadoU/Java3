package Abstracto;

public class Cuadrado extends Rectangulo {


	public Cuadrado(int base, int altura) {
		super(base, altura);
	}

	@Override
	public String toString() {
		return "Cuadrado [base=" + base + ", altura=" + altura + ", id=" + id + ", toString()=" + super.toString()
				+ ", hashCode()=" + hashCode() + ", area()=" + area() + ", getId()=" + getId() + ", getClass()="
				+ getClass() + "]";
	}

	
	
	
	
	
}
