package Abstracto;

import java.util.Objects;

public class Rectangulo extends Forma {

	//PROPIEDADES
	
	int base;
	int altura;
	
	
	
	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}



	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", id=" + id + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(altura, base);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		return altura == other.altura && base == other.base;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.base*this.altura;
	}



	@Override
	public void dibujar() {
		
		System.out.println("Esto es un rectangulo");
		
	}



	
	
	



	
	
	
	
	
	
	
}
