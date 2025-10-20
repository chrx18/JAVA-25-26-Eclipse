package bucleFor;

import java.util.Scanner;

public class Pedir5Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce un número: ");
			int numero = sc.nextInt();
		}
	}

}
