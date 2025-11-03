package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int numero, anterior = -1;
		boolean repetidos = false; //variable para anotar si han salido números repetidos
		
		
		do {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			//comprobar si el número es igual al que pusieron anteriormente
			
			if (numero == anterior) {
				repetidos = true;
			}
			//me preparo para la siguiente vuelta
			
			anterior = numero; //el número actual, la siguiente vuelta será el anterior
			
		} while (numero >= 0); //repetimos mientras no sea un número negativo
		
		if(repetidos == true) {
			System.out.println("Han salido números repetidos");
		} else {
			System.out.println("No han salido números repetidos");
		}
	}
}
