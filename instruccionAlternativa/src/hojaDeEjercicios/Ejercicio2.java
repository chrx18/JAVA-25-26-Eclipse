package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
//		2. Realizar un programa que dada una medida de tiempo expresada en horas,
//		minutos y segundos con valores arbitrarios, elabore un programa que
//		transforme dicha medida en una expresión correcta.
//
//		Introduciendo: 3 Horas 118 Minutos 195 Segundos
//		Da como salida: 5 Horas 1 Minuto 15 Segundos
		
		
	       Scanner sc = new Scanner(System.in);

	        // Pedir horas, minutos y segundos
	        System.out.print("Introduce las horas: ");
	        int horas = sc.nextInt();

	        System.out.print("Introduce los minutos: ");
	        int minutos = sc.nextInt();

	        System.out.print("Introduce los segundos: ");                            //ATENDER EXPLICACION
	        int segundos = sc.nextInt();

	        // Normalizar segundos a minutos
	        int minutosExtra = segundos / 60;
	        int segundosRestantes = segundos % 60;

	        // Sumar minutos extra
	        minutos += minutosExtra;

	        // Normalizar minutos a horas
	        int horasExtra = minutos / 60;
	        int minutosRestantes = minutos % 60;

	        // Sumar horas extra
	        int horasFinales = horas + horasExtra;

	        // Mostrar resultado
	        System.out.println("Tiempo normalizado: " + horasFinales + " Horas, " + minutosRestantes + " Minutos, " + segundosRestantes + " Segundos");
	    }
	}