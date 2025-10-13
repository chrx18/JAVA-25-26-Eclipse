package tema3;

import java.util.Scanner;

public class TEMA3__3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número del 1 al 10: ");
		int n = sc.nextInt();
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}

}
