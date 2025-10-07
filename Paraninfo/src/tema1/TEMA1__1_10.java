package tema1;

import java.util.Scanner;

public class TEMA1__1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Está lloviendo?");
		
		boolean llueve = sc.nextBoolean();
		
		System.out.println("Has hecho la tarea?");
		
		boolean tarea = sc.nextBoolean();
		
		System.out.println("Tienes que ir a la biblioteca?");
		
		boolean biblioteca = sc.nextBoolean();
		
		boolean salir = tarea && !llueve || biblioteca;
		
		System.out.println("Puedes salir: " + salir);
		
		

	}

}
