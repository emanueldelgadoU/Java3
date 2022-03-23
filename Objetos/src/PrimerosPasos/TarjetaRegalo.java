package PrimerosPasos;

public class TarjetaRegalo {

	
	//Propiedades
	private int numero;
	private int saldo;
	
	//Contructor
	
	TarjetaRegalo(){
		
	saldo=10000;
	numero=TarjetaRegalo.generarNumero();
		
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "TarjetaRegalo [numero=" + numero + ", saldo=" + saldo + "]";
	}

	public TarjetaRegalo(int numero, int saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public static int generarNumero() {
		
		int nuevaTarjeta;
		int num = (int) (Math.random()*120000000);
		nuevaTarjeta=+num;
		
		return nuevaTarjeta;
	}	
	
	public int gasta(int cantidad) {
		
		this.saldo-=cantidad;
		return saldo;
	}	
	
	//statica cuando no uese this
	
	public void fusionarTarjeta(TarjetaRegalo otra) {
		
		this.saldo+=(otra.getSaldo());
		otra=null;
		
	}	
	
	
	
	
	
	
	
	
	
	
	
}
