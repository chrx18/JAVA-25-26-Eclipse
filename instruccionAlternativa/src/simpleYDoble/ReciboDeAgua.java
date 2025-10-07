package simpleYDoble;

import java.util.Scanner;

public class ReciboDeAgua {

	public static void main(String[] args) {
//		Calculamos cuanto tengo que pagar en el recibo de Aqualia
//		Pediomos por teclado cuantos metros cubicos hemos consumido
//		Menos de 10 m, cada uno vale 1 euro
//		los que van de 10 a 19 valen a 4 euros
//		de 20 en adelante valen a 10 euros
		
		
		Scanner sc = new Scanner (System.in);
		
		int euros = 0;
		
		System.out.println("Introduce la cantidad de litros que hay que pagar: ");
		int litros = sc.nextInt();
		
		if (litros < 10) {
			System.out.println("Cada litro a 1 euro");
			euros = litros * 1;
		} else if (litros < 20) {
			System.out.println("Cada litro a 4 euros");
			euros = 10 * 1 + (litros - 10) * 4 ;
		} else if (litros >= 20) {
			System.out.println("Cada litro a 10 euros");
			euros = 10 * 1 + 9 * 4 + (litros - 19) * 10 ;
		}
		
		System.out.println("Tienes que pagar " + euros);

	}
	
}
