package tema3;

import java.util.Scanner;

public class TEMA3__3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numeroSecreto = (int) (Math.random() * 100 + 1);
		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		
		
		while (numeroSecreto != numero && numero != -1) {
			
			if (numeroSecreto > numero) {
				System.out.println("ES MAYOR");
			} else {
				System.out.println("ES MENOR");
			}
			
			System.out.println("Introduce otro número: ");
			numero = sc.nextInt();
			
		}
		
		if (numeroSecreto == numero) {
			System.out.println("HAS GANADO!!!!");
		} else {
			System.out.println("NO PASA NADA, OTRA VEZ SERA");
		}
		

	}

}
