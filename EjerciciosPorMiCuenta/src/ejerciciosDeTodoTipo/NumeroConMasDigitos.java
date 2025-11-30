package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class NumeroConMasDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero1, numero2, digito, contadorNumero1 = 0, contadorNumero2 = 0, copia1, copia2;
		

		
		System.out.println("Introduce un número: ");
		numero1 = sc.nextInt();
		
		System.out.println("Introduce otro número: ");
		numero2 = sc.nextInt();
		
		
		copia1 = numero1;
		copia2 = numero2;
		
		
		
		while(numero1 > 0) {
			digito = numero1 % 10;
			numero1 /= 10;
			contadorNumero1++;
		}
		
		while(numero2 > 0) {
			digito = numero2 % 10;
			numero2 /= 10;
			contadorNumero2++;
		}
		
		if (contadorNumero1 == contadorNumero2) {
			System.out.println("Los dos números tienen el mismo número de dígitos");
		} else if (contadorNumero1 > contadorNumero2) {
			System.out.println(copia1 + " > " + copia2);
		} else {
			System.out.println(copia1 + " < " + copia2);
		}

	}

}
