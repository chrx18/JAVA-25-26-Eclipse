package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class InvertirNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, digito, invertida = 0;
		
		System.out.println("Introduce un número para invertirlo: ");
		numero = sc.nextInt();
		
		while (numero > 0) {
			digito = numero % 10;
			invertida = invertida * 10 + digito;
			numero /= 10;
			
		}
		
		System.out.println(invertida);

	}

}
