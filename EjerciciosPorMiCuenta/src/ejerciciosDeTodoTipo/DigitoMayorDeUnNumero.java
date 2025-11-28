package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class DigitoMayorDeUnNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, digito, numeroMayor = 0;
		
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		while (numero > 0) {
			digito = numero % 10;
			
			if (digito > numeroMayor) {
				numeroMayor = digito;
			}
			
			numero /= 10;
		}
		
		System.out.println("El dígito mayor es: " + numeroMayor);
		
	}

}
