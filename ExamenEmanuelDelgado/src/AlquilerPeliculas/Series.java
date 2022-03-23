package AlquilerPeliculas;

import java.util.ArrayList;

public class Series extends Multimedia {

	
	//PROPIEDADES
	 protected ArrayList<Temporada> temporadas;

	//CONSTRUCTORES
	/**
	 * 
	 */
	public Series() {
		super();
	this.temporadas= new ArrayList<>();
	}

	/**
	 * @param titulo
	 * @param esPlus
	 * @param precio
	 */
	public Series(String titulo, boolean esPlus, int precio) {
		super(titulo, esPlus, precio);
		this.temporadas= new ArrayList<>();
	}

	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Series [temporadas=");
		builder.append(temporadas);
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
	
	
	public int getNumeroTemporadas() {
		return temporadas.size();
	}
	
	public void addTemporada(Temporada temporada) {
		temporada.setSerie(this);
		temporadas.add(temporada);
	}
	
	public void deleteTemporada(Temporada temporada) {
		temporadas.remove(temporada);
	}
	
	
	
	
	
}
