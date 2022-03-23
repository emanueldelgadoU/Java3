package PrimerosPasos;

import java.util.Objects;

public class NotasClase {


	//Propiedades
	String materia;
	int curso;
	double nota1EV;
	double nota2EV;
	double nota3EV;
	double NotaFinal;
	
	
	public NotasClase(String materia, int curso) {
		this.materia = materia;
		this.curso = curso;
	}
	
	
	public NotasClase(String materia, int curso, double nota1ev, double nota2ev, double nota3ev) {
		super();
		this.materia = materia;
		this.curso = curso;
		nota1EV = nota1ev;
		nota2EV = nota2ev;
		nota3EV = nota3ev;
	}


	


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	public int getCurso() {
		return curso;
	}


	public void setCurso(int curso) {
		this.curso = curso;
	}


	public double getNota1EV() {
		return nota1EV;
	}


	public void setNota1EV(double nota1ev) {
		nota1EV = nota1ev;
	}


	public double getNota2EV() {
		return nota2EV;
	}


	public void setNota2EV(double nota2ev) {
		nota2EV = nota2ev;
	}


	public double getNota3EV() {
		return nota3EV;
	}


	public void setNota3EV(double nota3ev) {
		nota3EV = nota3ev;
	}


	public double getNotaFinal() {
		return NotaFinal;
	}


	public void setNotaFinal(double notaFinal) {
		NotaFinal = notaFinal;
	}

	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(curso, materia, nota1EV, nota2EV, nota3EV);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotasClase other = (NotasClase) obj;
		return curso == other.curso && Objects.equals(materia, other.materia)
				&& Double.doubleToLongBits(nota1EV) == Double.doubleToLongBits(other.nota1EV)
				&& Double.doubleToLongBits(nota2EV) == Double.doubleToLongBits(other.nota2EV)
				&& Double.doubleToLongBits(nota3EV) == Double.doubleToLongBits(other.nota3EV);
	}


	//Se calcula con la media aritmética de las otras tres
	public double calcularNotaFinal() {
		
		double notaFinal=(nota1EV+nota2EV+nota3EV)/3;
		
		return notaFinal; 
	}
	
	public boolean aprobado(double notaFinal) {
		
		boolean aprobado=false;
		
		if (notaFinal>=5) {
			aprobado=true;
		}
		return aprobado;
	}
		

	@Override
	public String toString() {
		return "NotasClase [materia=" + materia + ", curso=" + curso + ", nota1EV=" + nota1EV + ", nota2EV=" + nota2EV
				+ ", nota3EV=" + nota3EV + ", NotaFinal=" + NotaFinal + "]";
	}
		
		
	
	
	
	
	

}
