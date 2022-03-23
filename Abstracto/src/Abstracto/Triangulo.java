package Abstracto;

public class Triangulo extends Forma {

	int base;
	int altura;
	


	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}



	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", id=" + id + "]";
	}



	@Override
	public double area() {
		
		return (this.base*this.altura)/2;
	}



	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("Esto es un triangulo");
	}
	
	
	
	
	
	
	
	
	
}
