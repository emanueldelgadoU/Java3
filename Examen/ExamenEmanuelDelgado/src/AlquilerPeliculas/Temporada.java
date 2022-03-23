package AlquilerPeliculas;

import java.util.ArrayList;

public class Temporada {

	//PROPIEDADES
	protected int numero;
	protected ArrayList<Episodio> episodios;
	protected Series serie;
	
	/**
	 * @param numero
	 */
	public Temporada(int numero) {
		super();
		this.numero = numero;
		this.episodios = new ArrayList<>();
	}

	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}


	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}


	public Series getSerie() {
		return serie;
	}


	public void setSerie(Series serie) {
		this.serie = serie;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Temporada [numero=");
		builder.append(numero);
		builder.append(", episodios=");
		builder.append(episodios);
		builder.append(", serie=");
		builder.append(serie.getTitulo());
		builder.append("]");
		return builder.toString();
	}


	public int getNumeroEpisodios() {
		return this.episodios.size();
	}
	
	
	public void addEpisodio(Episodio episodio) {
		episodio.setTemporadas(this);
		this.episodios.add(episodio);
	
	}
	
	public void delEpisodio(Episodio episodio) {
		episodios.remove(episodio);
	}
	
	
}
