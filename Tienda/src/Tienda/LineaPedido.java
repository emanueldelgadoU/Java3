package Tienda;

public class LineaPedido {

	protected Producto producto;
	protected int cantidad;
	/**
	 * @param producto
	 * @param cantidad
	 */
	public LineaPedido(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double subtotal() {
		return(this.producto.getPrecio()*this.cantidad)*this.producto.getIva();
	}
	
	
	
}
