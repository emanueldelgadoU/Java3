package AlquilerPeliculas;

public class Pelicula extends Multimedia {

	//PROPIEDADES
	protected int duracion;
	
	//CONSTRUCTORES
	
	/**
	 * @param titulo
	 * @param esPlus
	 * @param precio
	 */
	public Pelicula(String titulo, boolean esPlus, int precio) {
		super(titulo, esPlus, precio);
		
	}
	
	/**
	 * 
	 */
	public Pelicula() {
		super();
		
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [duracion=");
		builder.append(duracion);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", esPlus=");
		builder.append(esPlus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}

	

	
	
	
}
