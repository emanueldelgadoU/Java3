package AlquilerPeliculas;

import java.util.Objects;

public abstract class Cliente {
	
	//PROPIEDADES
	protected String dni;
	protected String nombre;
	protected int precioMensual;
	
	/**
	 * @param dni
	 * @param nombre
	 */
	public Cliente(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}
	/**
	 * 
	 */
	public Cliente() {
		super();
	}


	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setPrecioMensual(int precioMensual) {
		this.precioMensual = precioMensual;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", precioMensual=" + precioMensual + "]";
	}
	
	
	public abstract boolean esPro();
	
	public abstract double getPrecioMensual();
	
	


}
