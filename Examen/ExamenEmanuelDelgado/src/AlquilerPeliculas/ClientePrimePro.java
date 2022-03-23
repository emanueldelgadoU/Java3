package AlquilerPeliculas;

public class ClientePrimePro extends Cliente {

	//PROPIEDADES
	protected static int precioMensual = 5;
	
	/**
	 * @param dni
	 * @param nombre
	 */
	public ClientePrimePro(String dni, String nombre) {
		super(dni, nombre);
		this.precioMensual=precioMensual;
	}
	
	/**
	 * 
	 */
	public ClientePrimePro() {
		super();
		this.precioMensual=precioMensual;
	}



	@Override
	public boolean esPro() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getPrecioMensual() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
