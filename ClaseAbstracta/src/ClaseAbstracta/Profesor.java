package ClaseAbstracta;

import java.time.LocalDate;
import java.time.LocalTime;

public class Profesor {

	//PROPIEDADES
	protected int numRegistro;
	protected String nombre;
	protected String apellido;
	protected LocalDate fechaNacimiento;
	protected double nominaBase;
	
	
	//CONSTRUCTOR
	public Profesor() {
		super();
		this.numRegistro = numRegistro;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nominaBase = nominaBase;
	}


	public Profesor(int numRegistro, String nombre, String apellido, LocalDate fechaNacimiento, double nominaBase) {
		super();
		this.numRegistro = numRegistro;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nominaBase = nominaBase;
	}


	public Profesor(Profesor otro) {
		super();
		this.numRegistro = otro.numRegistro;
		this.nombre = otro.nombre;
		this.apellido = otro.apellido;
		this.fechaNacimiento = otro.fechaNacimiento;
		this.nominaBase = otro.nominaBase;
	}
	

	//GETTER Y SETTER
	public int getNumRegistro() {
		return numRegistro;
	}


	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public double getNominaBase() {
		return nominaBase;
	}


	public void setNominaBase(double nominaBase) {
		this.nominaBase = nominaBase;
	}


	public void importeNomina() {
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
