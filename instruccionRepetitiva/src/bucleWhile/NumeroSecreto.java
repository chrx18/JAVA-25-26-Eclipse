package bucleWhile;

import java.util.Scanner;

public class NumeroSecreto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroSecreto = (int) (Math.random() * 100);
		int numeroIntroducido;
		int contador = 0;
		
		System.out.println("Introduce un número: ");
		numeroIntroducido = sc.nextInt();
		
		while (numeroSecreto != numeroIntroducido) {
			
			contador ++;
			
			if (numeroIntroducido > numeroSecreto) {
				System.out.println("El número que buscas es más bajo.");
			} else {
				System.out.println("El número que buscas es más alto.");
			}
			
			System.out.print("Introduce otro número: ");
			numeroIntroducido = sc.nextInt();
		}
		
		System.out.println("\n¡HAS ACERTADO! Has necesitado " + contador + " intentos.");
		sc.close();
	}
}
