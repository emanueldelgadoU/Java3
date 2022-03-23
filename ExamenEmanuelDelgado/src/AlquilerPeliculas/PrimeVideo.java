package AlquilerPeliculas;

import java.util.ArrayList;

public class PrimeVideo {

	//PROPIEDADES
	protected ArrayList<Multimedia> catalogo;
	protected ArrayList<Cliente> suscriptores;
	protected double ganacias;
	
	//CONSTRCUTORES
	
	/**
	 * 
	 */
	public PrimeVideo() {
		super();
	this.catalogo = new ArrayList<>();
	this.suscriptores = new ArrayList<>();
	this.ganacias=0;
	}
	
	//METODO PARA AÑADIR SUSCRIPTORES
	public void addSuscriptor(Cliente c) {
		if (suscriptores.indexOf(c)<0){
			suscriptores.add(c);
		}
	}
	
	//METODO PARA ELIMINAR SUSCRIPTORES
	public void deleteSuscriptor(Cliente c) {
		if (suscriptores.indexOf(c)>=0){
			suscriptores.remove(c);
		}
	}
	
	//METODO AÑADE PELICULAS AL CATALOGO
	public void addMultimedia(Multimedia m) {
		if (catalogo.indexOf(m)<0){
			catalogo.add(m);
		}
	}
	
	//METODO ELIMINAR PELICULAS AL CATALOGO
		public void deleteMultimedia(Multimedia m) {
			if (catalogo.indexOf(m)>=0){
				catalogo.add(m);
			}
		}
		
	//METODO SI EL CLIENTE NO ES PRO SE AÑADE A GANACIAS EL PRECIO DEL MULTIMEDIA
		public void ver(Multimedia m, Cliente c) {
			if (c.esPro()==false && m.esPlus==true) {
				this.ganacias+=10;
			}
		}	
	
	//METODO DEVUELVE LAS GANACIAS
		public double getGanancias() {
		return this.ganacias+=(ClientePrime.precioMensual*12)+(ClientePrimePro.precioMensual*12);
	
	}	
	
			
		
		
		
		
		
		
		
		
		
		
}
