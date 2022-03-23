package AlquilerPeliculas;

public class ClientePrime extends Cliente {

	//PROPIEDADES
	protected static int precioMensual = 3;
	
	
	/**
	 * @param dni
	 * @param nombre
	 */
	public ClientePrime(String dni, String nombre) {
		super(dni, nombre);
		this.precioMensual=precioMensual;
			
	}
	
	/**
	 * 
	 */
	public ClientePrime() {
		super();
		this.precioMensual=precioMensual;
	}

	
	@Override
	public boolean esPro() {
		return false;
	}

	@Override
	public double getPrecioMensual() {
		return 3;
	}
	
}
