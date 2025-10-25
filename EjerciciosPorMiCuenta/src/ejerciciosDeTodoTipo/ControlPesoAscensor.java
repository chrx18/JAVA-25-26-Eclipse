package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ControlPesoAscensor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int peso;
		int pesoTotal = 0;
		
		int numeroPersonas;
		
		System.out.println("Introduce el número de personas que se van a subir al ascensor: ");
		numeroPersonas = sc.nextInt();

		for (int i = 1; i <= numeroPersonas; i++) {
			System.out.println("Cuanto pesa la persona " + i + "?");
			peso = sc.nextInt();
			
			pesoTotal += peso;

		}
		System.out.println("PESO TOTAL: " + pesoTotal);
		
		if (pesoTotal > 500) {
			System.out.println("NO PUEDEN SUBIR, SUPERA EL LÍMITE");
		} else {
			System.out.println("Adelante, podeis pasar");
		}
	}

}
