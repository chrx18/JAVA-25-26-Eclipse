package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class SumaNumerosImparesHastaN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, suma = 0;
		
		System.out.println("Introduce hasta qué número sumar: ");
		numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i += 2) {
			suma += i;
		}
		System.out.println("La suma de los números impares hasta " + numero + " es igual a " + suma);
	}

}
