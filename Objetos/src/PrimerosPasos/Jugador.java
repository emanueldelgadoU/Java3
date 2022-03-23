package PrimerosPasos;

public class Jugador {

	
	
	// Propiedades
	private int vida; //1-100
	private int mana; //1-100
	private int damageFisico;
	private int damageMagico;
	String nombre;
	String clase;
	
	// Constructores
	Jugador() {
		this.vida=100;
		this.mana=100;
		this.damageFisico=2;
		this.damageMagico=15;
		this.nombre="Joselito";
		this.clase="Mago";
	}

	public Jugador(int vida, int mana, int damageFisico, int damageMagico, String nombre, String clase) {
		this.vida = vida;
		this.mana = mana;
		this.damageFisico = damageFisico;
		this.damageMagico = damageMagico;
		this.nombre = nombre;
		this.clase = clase;
	}
	

	// Getter y Setter
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getDamageFisico() {
		return damageFisico;
	}

	public void setDamageFisico(int damageFisico) {
		this.damageFisico = damageFisico;
	}

	public int getDamageMagico() {
		return damageMagico;
	}

	public void setDamageMagico(int damageMagico) {
		this.damageMagico = damageMagico;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	@Override
	public String toString() {
		return "Jugador [vida=" + vida + ", mana=" + mana + ", damageFisico=" + damageFisico + ", damageMagico="
				+ damageMagico + ", nombre=" + nombre + ", clase=" + clase + "]";
	}

	
	public void golpear(String tipo, Jugador rival) {
		
		
		
		if(tipo.equals("magico")) {
			rival.setVida(vida);;
			this.mana
			
		}else if(tipo.equals("fisico"))
			
				
			
			
			
		}
	}


	

	
	
	
	
	
	
	
}
