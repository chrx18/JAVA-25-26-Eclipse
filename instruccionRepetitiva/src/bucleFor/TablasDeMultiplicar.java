package bucleFor;

import java.util.Scanner;

public class TablasDeMultiplicar {

	public static void main(String[] args) {
				
		for (int i = 0; i <= 10; i++) {
			System.out.println("\nTABLA DEL " + i);
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			 }
		}
		
	}

}
