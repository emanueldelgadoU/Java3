package Examen;

public class Ejercicio5 {

	public static void llenarArray(int[]array) {
		
		for(int i=0; i<=array.length-1; i++) {
				array[i]=(int) (Math.random()*6)+1;
		}
	}
		
	public static void mostrarArray(int[]array) {
		
		for(int i=0; i<=array.length-1; i++) {
				System.out.print(array[i]+" ");
		}
	}

	public static void burbuja(int vector[]) {
		int aux=0;
		for(int i=0; i<vector.length; i++) {
			for(int j=0; j<vector.length-1; j++) {
				if (vector[j] > vector[j+1]) {
					aux = vector[j];
					vector[j] = vector[j+1];
					vector[j+1] = aux;
				}
			}
		}		
	}

	public static void resultadoTirada(int vector[]) {
		
	int dado1 = vector[0];
	int dado2 = vector[1];
	int dado3 = vector[2];
	int dado4 = vector[3];
	int dado5 = vector[4];
	
	if (dado1 == dado2 && dado1 == dado3 && dado1 == dado4 && dado1 == dado5) {
			System.out.println("Póker real");
		
		}else if ((dado1 == dado2 && dado1 == dado3 && dado1 == dado4) || (dado2 == dado3 && dado2 == dado4 && dado2 == dado5)){
			System.out.println("Póker");
		
		}else if ((dado1 == dado2 && dado1 == dado3 && dado4 == dado5) || (dado1 == dado2 && dado3 == dado4 && dado3 == dado5)) {
			System.out.println("Full");	
			
		}else if(dado1 == 1 && dado2 ==2 && dado3 == 3 && dado4 == 4 && dado5 == 5) {
			System.out.println("Escalera menor");
			
		}else if (dado1 == 2 && dado2 ==3 && dado3 == 4 && dado4 == 5 && dado5 == 6) {
			System.out.println("Escalera mayor");
			
		}else if ((dado1 == dado2 && dado1 == dado3) || ( dado3 == dado4 && dado3 == dado5) || ( dado2 == dado3 && dado2 == dado4))  {
			System.out.println("Piernas");	
			
		}else if (((dado1 == dado2) && ( dado3 == dado4)) || ( dado2 == dado3 && dado4 == dado5)) {
			System.out.println("Dobles parejas");			
		
		}else if (((dado1 == dado2) || ( dado2 == dado3) || ( dado3 == dado4)) || ( dado4 == dado5)) {
			System.out.println("Parejas");	
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] tirada = new int [5];

		
		llenarArray(tirada);
		burbuja(tirada);
		mostrarArray(tirada);
		resultadoTirada(tirada);
		
		
		
		
		
		
		
		
		
		
		
	}

}
