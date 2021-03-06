package PrimerosPasos;

public class CuentaCorriente {

	
	//Propiedades
	private String numero;
	private double saldo;
	
	//Constructor
	CuentaCorriente() {
		this.saldo=0;
		this.numero= CuentaCorriente.generarNumero();	
}

	public CuentaCorriente(String numero, double salgo) {
		super();
		this.numero = numero;
		this.saldo = salgo;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [numero=" + numero + ", saldo=" + saldo + "]";
	}


	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void cargo(double cantidad) {
		if ((this.saldo - cantidad) >=0)
			this.saldo -= cantidad;
	}

	
	public void transferencia(CuentaCorriente otra, double cantidad) {
		this.saldo -= cantidad; //me quito yo la cantidad
		otra.setSaldo(cantidad+otra.getSaldo()); //get saldo absorve la info que tiene la variable el set salgo la actualiza
	}
	
	
	public void ingreso(double cantidad) {
		this.saldo+= cantidad;
	}
	
	public static String generarNumero() {
		
		String nuevaCuenta = "ES404040";
		int num = (int) (Math.random()*1200000000);
		nuevaCuenta=nuevaCuenta+num;
		
		return nuevaCuenta;
	}	
}


