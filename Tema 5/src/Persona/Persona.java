package Persona;

public class Persona {

	//ATRIBUTOS
	
	private String nombre;
	private int edad;
	private String sexo;
	private double peso;
	private double altura;
	
		
	
	//METODOS
	
	public Persona() {  //los parametros numericos se inicializan a 0; los parametros string se inicializan como cadena vacia; el sexo se inicializa como H
		super();
		this.nombre = "";
		this.edad = 0;
		this.sexo = "H";
		this.peso = 0;
		this.altura = 0;
	}	
	
	
	public Persona(String nombre, int edad, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}	
	
	
	public double calcularIMC() {
		double devuelve = 0;
		double ideal = peso/Math.pow(altura, 2);
		if (ideal < 20){
			devuelve = -1;
			System.out.println("peso ideal");
		}
		if (ideal >= 20 && ideal <= 25) {
			devuelve = 0;
			System.out.println("por debajo del peso ideal");
		}
		if (ideal > 25) {
			devuelve = 1;
			System.out.println("sobrepeso");
		}
		return devuelve;
	}
	
	public String esMayorEdad(){
		String mayor = "";
		if (edad >= 18) {
			mayor = "es mayor de edad";
		}else {
			mayor = "es menor de edad";
		}
		return mayor;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", calcularIMC()=");
		builder.append(calcularIMC());
		builder.append(", esMayorEdad()=");
		builder.append(esMayorEdad());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
