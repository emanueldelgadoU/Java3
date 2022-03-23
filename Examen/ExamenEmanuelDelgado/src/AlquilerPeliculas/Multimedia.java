package AlquilerPeliculas;

import java.util.Objects;

public class Multimedia {

	//PROPIEDADES
	protected int codigo;
	protected String titulo;
	protected boolean esPlus;
	protected int precio;
	protected Genero genero;
	static int autoincremento=1;
	
	/**
	 * @param titulo
	 * @param esPlus
	 * @param precio
	 */
	public Multimedia(String titulo, boolean esPlus, int precio) {
		super();
		this.autoincremento++;
		this.codigo=autoincremento;
		this.titulo = titulo;
		this.esPlus = esPlus;
		this.precio = precio;
		
	}

	/**
	 * 
	 */
	public Multimedia() {
		super();
	}

	//GETTER Y SETTER
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isEsPlus() {
		return esPlus;
	}

	public void setEsPlus(boolean esPlus) {
		this.esPlus = esPlus;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [codigo=");
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
