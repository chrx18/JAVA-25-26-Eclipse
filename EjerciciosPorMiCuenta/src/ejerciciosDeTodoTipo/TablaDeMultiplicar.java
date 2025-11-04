package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero;
		
		
		System.out.println("De que número quieres saber la tabla de multiplicar?: ");
		numero = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}

	}

}
