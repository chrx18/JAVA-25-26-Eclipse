package multiple;

import java.util.Scanner;

public class Gentilicios {

	public static void main(String[] args) {
		// Pedimos el nombre del pueblo y pongo su gentilicio	
		
		Scanner sc = new Scanner (System.in);
		
		String pueblo;
		
		System.out.println("En que pueblo vives?: ");
		
		pueblo = sc.nextLine();
		
		
		switch (pueblo) {
		case "Toledo":
			System.out.println("Toledano");
			break;
		case "Illescas":
			System.out.println("Illarcuriense");
			break;
		case "Fuensalida":
			System.out.println("Fuensalidano");
			break;
		default:
				System.out.println("No conozco ese pueblo");
				break;
		}

	}

}
