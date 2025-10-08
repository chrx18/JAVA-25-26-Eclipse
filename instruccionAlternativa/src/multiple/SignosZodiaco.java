package multiple;

import java.util.Scanner;

public class SignosZodiaco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce tu día de nacimiento: ");
		int dia = sc.nextInt();
		
		
		System.out.println("Introduce tu mes de nacimiento: ");
		int mes = sc.nextInt();
		
		
		if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
		    System.out.println("ERES ARIES");
		    
		} else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
		    System.out.println("ERES TAURO");
		    
		} else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
		    System.out.println("ERES GÉMINIS");
		    
		} else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
		    System.out.println("ERES CÁNCER");
		    
		} else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
		    System.out.println("ERES LEO");
		    
		} else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
		    System.out.println("ERES VIRGO");
		    
		} else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
		    System.out.println("ERES LIBRA");
		    
		} else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
		    System.out.println("ERES ESCORPIO");
		    
		} else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
		    System.out.println("ERES SAGITARIO");
		    
		} else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
		    System.out.println("ERES CAPRICORNIO");
		    
		} else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
		    System.out.println("ERES ACUARIO");
		    
		} else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
		    System.out.println("ERES PISCIS");
		    
		    
		} else {
		    System.out.println("FECHA NO VÁLIDA");
		}
		
	}
}


