package ClaseAbstracta;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {

	//PROPIEDADES
	protected LocalDate fechaInterinidad;

	public ProfesorInterino() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfesorInterino(int numRegistro, String nombre, String apellido, LocalDate fechaNacimiento,
			double nominaBase, LocalDate fechaInterinidad) {
		super(numRegistro, nombre, apellido, fechaNacimiento, nominaBase);
		this.fechaInterinidad=fechaInterinidad;
		this.nominaBase=nominaBase+(this.nominaBase*0.10);
	}

	public ProfesorInterino(Profesor otro) {
		super(otro);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
}
