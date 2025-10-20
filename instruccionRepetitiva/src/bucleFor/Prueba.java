package bucleFor;

import java.util.Iterator;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Prueba del bucle For 
//		
//		 for (inicio ; condicion ; incremento) {
//			 instrucciones;
//		 }
		
		
//		bucle que imprime 5 veces la palabra Hola
		
		for (int i = 1; i <= 5; i++) { //la variable de control i, contiene el numero de repeticiones
			System.out.println("Hola");
		}
		
		System.out.println("-------------------------");
		
		
//		imprimo por que repetición voy
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("\nvuelta: " + i);
		}
		
		System.out.println("-----------------------------");
		
//		imprimo la vuelta pero del revés
		
		for (int i = 5; i >= 1; i--) {
			System.out.println("\nvuelta: " + i);
		}
		
		System.out.println("----------------------");
		
		for (int i = 1; i <= 10; i += 2) {
			System.out.println("\nvuelta: " + i);
		}
		
		
		System.out.println("-----------------------------");	
		
		for (double i = 1; i <= 5; i += 0.5) {
			System.out.println("\nvuelta: " + i);
		}
		
		
	}

}
