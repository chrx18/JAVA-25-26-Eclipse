package hojaDeEjercicios2;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		for (int n = 100; n <= 999; n++) {

			int c = n / 100;           
			int d = (n / 10) % 10;     
			int u = n % 10;            
			
			int suma = c*c*c + d*d*d + u*u*u;

			if (suma == n) {
				System.out.print(n + " ");
			}

		}

	}

}
