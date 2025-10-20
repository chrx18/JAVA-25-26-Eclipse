package bucleWhile;

import java.util.Scanner;

public class NumeroSecretoV2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			int numeroSecreto = (int) (Math.random() * 100);
		int numeroIntroducido;
		int contador = 0;
		boolean acertado = false;
		
		System.out.println("Tienes 10 intentos para adivinar el número secreto (entre 0 y 99).");
		
		while (contador < 10 && !acertado) {
			System.out.print("Introduce un número: ");
			numeroIntroducido = sc.nextInt();
			contador++;
			
			if (numeroIntroducido > numeroSecreto) {
				System.out.println("El número que buscas es más bajo.\n");
			} else if (numeroIntroducido < numeroSecreto) {
				System.out.println("El número que buscas es más alto.\n");
			} else {
				acertado = true;
			}
		}
		
		if (acertado) {
			System.out.println("\n¡HAS ACERTADO! Has necesitado " + contador + " intentos.");
		} else {
			System.out.println("\nHAS PERDIDO. El número secreto era: " + numeroSecreto);
		}
		
		sc.close();
	}
}
