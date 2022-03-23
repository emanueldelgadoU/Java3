import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int resto = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero");
		num=teclado.nextInt();
		System.out.println(num%500);
		
		if (num/500>=1){resto=num%500;
		System.out.println(num/500+" Billetes de 500");
			
		} if (resto/200>=1) {
		System.out.println(resto/200+" Billetes de 200");
		resto=num%200;
		
		} if (resto/100>=1) {
		System.out.println(resto/100+" Billetes de 100");
		resto=num%100;
		
		} if (resto/50>=1) {
		System.out.println(resto/50+" Billetes de 50");
		resto=num%50;
		
		} if (resto/20>=1) {
		System.out.println(resto/20+" Billetes de 20");
		resto=num%20;
		
		} if (resto/10>=1) {
		System.out.println(resto/10+" Billetes de 10");
		resto=num%10;
		
		} if (resto/5>=1) {
		System.out.println(resto/5+" Billetes de 5");
		resto=num%5;
		
		} if (resto/2>=1) {
		System.out.println(resto/2+" Monedas de 2");
		resto=num%2;
		
		} if (resto/1>=1) {
		System.out.println(resto/1+" Monedas de 1");
		resto=num%1;
		}

	}
	
}
