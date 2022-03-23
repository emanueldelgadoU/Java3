package PrimerosPasos;

public class Arma {

	
	//Prpiedades
	private String nombre;
	private int damage;
	private String tipo;
	
	//constructor
	
	Arma() {
		this.nombre="Espada";
		this.damage=5;
		this.tipo="Fisico";
	}

	public Arma(String nombre, int damage, String tipo) {
		super();
		this.nombre = nombre;
		this.damage = damage;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", damage=" + damage + ", tipo=" + tipo + "]";
	}
	

	
}
