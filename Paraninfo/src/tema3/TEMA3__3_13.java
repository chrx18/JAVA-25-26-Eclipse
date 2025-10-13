package tema3;

import java.util.Scanner;

public class TEMA3__3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int nota;
		int suspensos = 0;
		int condicionados = 0;
		int aprobados = 0;
		
		for (int i = 1; i <= 6; i++) {
			System.out.println("Introduce la nota: ");
			nota = sc.nextInt();
			
			if (nota < 4) {
				suspensos++;
			} else if (nota == 4) {
				condicionados++;
			} else if (nota >= 5) {
				aprobados++;
			}
		}
		
		System.out.println("Aprobados: " + aprobados);
		System.out.println("Condicionados: " + condicionados);
		System.out.println("Suspensos: " + suspensos);
	}

}