package Abstracto;

import java.util.Objects;

public class Circulo extends Forma {

	//PROPIEADES
	double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", id=" + id + "]";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*(Math.pow(radio, 2));
	}

	@Override
	public void dibujar() {
		
		System.out.println("Esto es un circulo");
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(radio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}

	
	
	
	
	
	
}
