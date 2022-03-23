package Tienda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

	protected static int incremento=1;
	protected int codigo;
	protected LocalDate fecha;
	protected double total; //Calcular, no aparece en el contrcturo.
	protected Cliente cliente;
	protected ArrayList<LineaPedido> linea;
	/**
	 * @param codigo
	 */
	
	public Pedido(Cliente codigo) {
		super();
		this.codigo = Pedido.incremento++;;
		Pedido.incremento++;
		this.fecha= LocalDate.now();
		this.linea= new ArrayList<>();
		this.total=0;
	}
	
	
	
	public double total(){
		// el total se actualiza cada vez que se añade una nueva Lineapedido con el metodo nuevoLinea
		return total-this.cliente.decuento();
		
	}
	

	public ArrayList<LineaPedido> getLineas(){
		return this.linea;	
	}
	
	public void nuevaLinea(LineaPedido lp){
		//Si hay una linea de pddi ya coibn el mismo prodcutor lo que hago es actualizar la cantidad con esa linea de pedido
		linea.add(lp);
		this.total+=lp.subtotal();		
	}
}
