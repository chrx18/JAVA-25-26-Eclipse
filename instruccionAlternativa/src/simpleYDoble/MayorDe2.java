package simpleYDoble;

import java.util.Scanner;

public class MayorDe2 {

	public static void main(String[] args) {
		// Pedir dos números por teclado y mostrar en pantalla el mayor de los dos
		
		Scanner sc = new Scanner (System.in);
		
		int numero1, numero2;
		
		
		System.out.println("Teclea un número: ");
		numero1 = sc.nextInt();
		
		System.out.println("Teclea otro número");
		numero2 = sc.nextInt();
		
		
		if (numero1 == numero2) {
			System.out.println("Son iguales");
		} else {
			
		if (numero1 > numero2) {
			System.out.println(numero1 + " es mayor que " + numero2);
		} else {
			System.out.println(numero2 + " es mayor que " + numero1);
		}
		
		}
		
	
	}

}