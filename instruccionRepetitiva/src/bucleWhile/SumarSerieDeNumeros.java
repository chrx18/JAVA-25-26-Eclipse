package bucleWhile;

import java.util.Scanner;

public class SumarSerieDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double objetivo;

        System.out.print("Introduce el valor acumulado que quieres conseguir: ");
        objetivo = sc.nextDouble();

        while (suma < objetivo) {
            contador++;
            suma += 1.0 / contador;
        }
        
        System.out.println("Se han necesitado " + contador + " términos para superar el valor " + objetivo);
        System.out.println("La suma final es: " + suma);
    }
}
