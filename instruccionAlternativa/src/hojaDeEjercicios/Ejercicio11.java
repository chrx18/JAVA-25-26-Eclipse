package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
//		11. Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar:
//		cincuenta y seis.

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número del 0 al 99: ");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 99) {
            System.out.println("El número debe estar entre 0 y 99.");
        } else if (numero < 10) {
            // unidades
            switch (numero) {
                case 0: System.out.println("cero"); break;
                case 1: System.out.println("uno"); break;
                case 2: System.out.println("dos"); break;
                case 3: System.out.println("tres"); break;
                case 4: System.out.println("cuatro"); break;
                case 5: System.out.println("cinco"); break;
                case 6: System.out.println("seis"); break;
                case 7: System.out.println("siete"); break;
                case 8: System.out.println("ocho"); break;
                case 9: System.out.println("nueve"); break;
            }
        } else if (numero < 20) {
            // del 10 al 19
            switch (numero) {
                case 10: System.out.println("diez"); break;
                case 11: System.out.println("once"); break;
                case 12: System.out.println("doce"); break;
                case 13: System.out.println("trece"); break;
                case 14: System.out.println("catorce"); break;
                case 15: System.out.println("quince"); break;
                case 16: System.out.println("dieciséis"); break;
                case 17: System.out.println("diecisiete"); break;
                case 18: System.out.println("dieciocho"); break;
                case 19: System.out.println("diecinueve"); break;
            }
        } else {
        	
            int decenas = numero / 10;
            int unidades = numero % 10;

            if (decenas == 2 && unidades == 0) System.out.println("veinte");
            else if (decenas == 2 && unidades > 0) {
                System.out.print("veinti");
                switch (unidades) {
                    case 1: System.out.println("uno"); break;
                    case 2: System.out.println("dos"); break;
                    case 3: System.out.println("tres"); break;
                    case 4: System.out.println("cuatro"); break;
                    case 5: System.out.println("cinco"); break;
                    case 6: System.out.println("seis"); break;
                    case 7: System.out.println("siete"); break;
                    case 8: System.out.println("ocho"); break;
                    case 9: System.out.println("nueve"); break;
                }
            } else {
                switch (decenas) {
                    case 3: System.out.print("treinta"); break;
                    case 4: System.out.print("cuarenta"); break;
                    case 5: System.out.print("cincuenta"); break;
                    case 6: System.out.print("sesenta"); break;
                    case 7: System.out.print("setenta"); break;
                    case 8: System.out.print("ochenta"); break;
                    case 9: System.out.print("noventa"); break;
                }

                if (unidades != 0) {
                    System.out.print(" y ");
                    switch (unidades) {
                        case 1: System.out.print("uno"); break;
                        case 2: System.out.print("dos"); break;
                        case 3: System.out.print("tres"); break;
                        case 4: System.out.print("cuatro"); break;
                        case 5: System.out.print("cinco"); break;
                        case 6: System.out.print("seis"); break;
                        case 7: System.out.print("siete"); break;
                        case 8: System.out.print("ocho"); break;
                        case 9: System.out.print("nueve"); break;
                    }
                    System.out.println(); // salto de línea final
                } else {
                    System.out.println(); // si acaba en decena exacta
                }
            }
        }
    }
}