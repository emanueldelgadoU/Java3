package AlquilerPeliculas;

public class Episodio {

	//PROPIEDADES
	protected String titulo;
	protected int duracion;
	protected Temporada temporadas;

	//CONSTRUCTORES
	/**
	 * @param titulo
	 * @param duracion
	 * @param temporadas
	 */
	public Episodio(String titulo, int duracion) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;

	}
	
	public Episodio() {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Temporada getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(Temporada temporadas) {
		this.temporadas = temporadas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Episodio [titulo=");
		builder.append(titulo);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", temporadas=");
		builder.append(temporadas);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
