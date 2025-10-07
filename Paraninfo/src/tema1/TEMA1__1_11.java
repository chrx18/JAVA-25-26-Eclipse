package tema1;

import java.util.Scanner;

public class TEMA1__1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		final double precioManzanas = 2.35;
		
		final double precioPeras = 1.95;
		
		int vManzanass1, vManzanass2;
		
		int vPerass1, vPerass2;
		
		double impTotal;
		
		System.out.println("Ventas de manzanas semestre 1: ");
		
		vManzanass1 = sc.nextInt();
		
		System.out.println("Ventas de manzanas semestre 2: ");
		
		vManzanass2 = sc.nextInt();
		
		System.out.println("Ventas de peras semestre 1: ");
		
		vPerass1 = sc.nextInt();
		
		System.out.println("Ventas de peras semestre 2: ");
		
		vPerass2 = sc.nextInt();
		
		
		impTotal = (vManzanass1 + vManzanass2) * precioManzanas;
		
		impTotal += (vPerass1 + vPerass2) * precioPeras;
		
		
		System.out.println("El precio del importe total es de: " + impTotal);
		
		
		
		
		
		
		
		
		

	}

}
