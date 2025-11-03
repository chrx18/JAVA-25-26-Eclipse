package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int cuantos, nuevo, anterior, antesDeAnterior;
		
		System.out.println("Cuantos números imprimo??: ");
		cuantos = sc.nextInt();
		
		System.out.print("0 1 "); //los dos primeros los imprimo tal cual
		antesDeAnterior = 0;
		anterior = 1;			 //anoto los valores en las variables anterior
		
		for (int i = 3; i <= cuantos; i++) {
			
			//calcular el nuevo número
			nuevo = antesDeAnterior + anterior;
			
			//lo muestro en pantalla
			System.out.print(nuevo + " ");
			
			//me preparo para la vuelta siguiente
			antesDeAnterior = anterior;
			anterior = nuevo;
		}
		
	}

}	