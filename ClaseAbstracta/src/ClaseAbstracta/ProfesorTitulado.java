package ClaseAbstracta;

import java.time.LocalDate;

public class ProfesorTitulado extends Profesor {

	//PROPIEDADES
	private boolean catedratico;
	
	
	
	public ProfesorTitulado() {
		super();
		this.catedratico=false;
		this.nominaBase=this.nominaBase+(this.nominaBase*0.30);
	}

	public ProfesorTitulado(int numRegistro, String nombre, String apellido, LocalDate fechaNacimiento,
			double nominaBase) {
		super(numRegistro, nombre, apellido, fechaNacimiento, nominaBase);
		this.catedratico=false;
		this.nominaBase=nominaBase+(this.nominaBase*0.30);
	}

	public ProfesorTitulado(Profesor otro) {
		super(otro);
		this.catedratico=false;
		this.nominaBase=this.nominaBase+(this.nominaBase*0.30);
	}
	
	
	
	
	
}
