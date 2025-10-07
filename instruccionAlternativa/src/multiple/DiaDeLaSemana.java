package multiple;

import java.util.Scanner;

public class DiaDeLaSemana {

	public static void main(String[] args) {
		// Pedimos un dia del 1 al 7 y ponemos en letras el dia que corresponde
		// Si pongo un numero raro me avisara
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero del 1 al 7");
		int num = sc.nextInt();
		
		/* La alternativa multiple switch
		 * en lugar de condicion lleva una variable
		 * cada uno de los caminos se rotula con un case:
		 * el camino default: se usa para situaciones de error
		 */
		
		switch (num) {  //dependiendo del valor de numero, escojo un camino
 		case 1:
 			System.out.println("Lunes");
			break;
 		case 2: 
 			System.out.println("Martes");
 			break;
 		case 3:
 			System.out.println("Miercoles");
 			break;
 		case 4:
 			System.out.println("Jueves");
 			break;
 		case 5:
 			System.out.println("Viernes");
 			break;
 		case 6:
 			System.out.println("Sabado");
 			break;
 		case 7:
 			System.out.println("Domingo");
 			break;
		default:
			System.out.println("No has introducido un dia correcto");
			break;
		}

	}

}
