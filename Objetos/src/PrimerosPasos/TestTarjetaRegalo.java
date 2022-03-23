package PrimerosPasos;

public class TestTarjetaRegalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TarjetaRegalo tt1= new TarjetaRegalo();
		TarjetaRegalo tt2= new TarjetaRegalo();
		System.out.println(tt1);
		tt1.gasta(5000);
		System.out.println(tt1);
		
		tt2.setSaldo(1000);
		System.out.println(tt2);
		
		tt2.fusionarTarjeta(tt1);
		
		System.out.println(tt2);
		
		
		
		
	}

}
