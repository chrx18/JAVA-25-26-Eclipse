package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class TablaDeMultiplicarAlReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un número para saber su tabla de multiplicar: ");
		numero = sc.nextInt();
		
		System.out.println("LA TABLA DEL " + numero);
		
		for (int i = 10; i >= 0 ; i--) {
			System.out.println(numero + " * " + i + " = " + (i*numero));
		}

	}

}
