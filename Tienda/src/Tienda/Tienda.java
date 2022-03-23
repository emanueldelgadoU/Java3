package Tienda;

public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Categoria moviles = new Categoria(null);
		Categoria perifericos = new Categoria(null);
		Producto p1 = new Producto("Iphone", "tel", "adas", moviles, 100, 11);
		Producto p2 = new Producto("otrooo", "tel", "adas", moviles, 100, 11);
		
		ClienteRegistrado cr1 = new ClienteRegistrado("Emi", "Del", "23123123", "Vera", "Micasa", null, null, null);
		
		Pedido ped1 = new Pedido(cr1);
		
		System.out.println(ped1);
		
	}

}
