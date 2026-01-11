package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class MarcoConNumeroCentral {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce un número impar: ");
        n = sc.nextInt();

        int filaCentro = (n + 1) / 2;        // (PrimeraPosicion + UltimaPosicion) / 2
        int columnaCentro = (n + 1) / 2;

        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n; j++) {

                if (i == filaCentro && j == columnaCentro) {
                    System.out.print("0 ");
                }
                
                else if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                }

                else {
                    System.out.print("- ");
                }

            }
            System.out.println(); 
        }

    }

}
