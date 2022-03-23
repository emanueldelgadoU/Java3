package Abstracto;

public abstract class Forma {

	
	//PROPIEDADES
	int id;
	static int contadorF=0;

	public Forma() {
		Forma.contadorF++;
		this.id = Forma.contadorF; ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Forma [id=" + id + "]";
	}
	
	
	public abstract double area(); 
	
	public abstract void dibujar();
		
	
}
