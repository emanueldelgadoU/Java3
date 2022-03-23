package Wordle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Wordle {

	//PROPIEDADES
	protected String[] diccionario = {"motor","avion","melon","patin","motor","avion","melon","patin","motor","avion","melon","patin","motor","avion","melon","patin"};
	protected String palabraAcertar;
	protected String palabraActual;
	protected ArrayList<Character> letrasNoEstan;

	
	
	public String[] getDiccionario() {
		return diccionario;
	}



	public void setDiccionario(String[] diccionario) {
		this.diccionario = diccionario;
	}



	public String getPalabraAcertar() {
		return palabraAcertar;
	}



	public void setPalabraAcertar(String palabraAcertar) {
		this.palabraAcertar = palabraAcertar;
	}



	public String getPalabraActual() {
		return palabraActual;
	}



	public void setPalabraActual(String palabraActual) {
		this.palabraActual = palabraActual;
	}



	public ArrayList<Character> getLetrasNoEstan() {
		return letrasNoEstan;
	}



	public void setLetrasNoEstan(ArrayList<Character> letrasNoEstan) {
		this.letrasNoEstan = letrasNoEstan;
	}



	public void wordle() {
		int dia = LocalDate.now().getDayOfMonth();
		palabraAcertar = this.diccionario[dia];
		letrasNoEstan = new ArrayList<>();
	}
	
	public void wordle(String palabra) {
		if (palabra.length()==5) {	
			palabraAcertar=palabra;
		}
	}
	
	public boolean comprobar(String intento) {
		
		if (intento.length()==5) {
			for (int i = 0; i < intento.length(); i++) {
				char a=intento.charAt(i);
				
				
				
				
				
			}
		}
		
		return false;
	}
	

}
