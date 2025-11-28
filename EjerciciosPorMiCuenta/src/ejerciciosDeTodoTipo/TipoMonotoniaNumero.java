package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class TipoMonotoniaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        // Guardamos el primer dígito como "anterior"
        int anterior = numero % 10;
        numero /= 10;

        // Inicializamos las banderas
        boolean esCreciente = true;
        boolean esDecreciente = true;

        // Recorremos los dígitos
        while (numero > 0) {
            int digito = numero % 10;

            if (digito < anterior) {
                esCreciente = false; // rompe regla creciente
            }
            if (digito > anterior) {
                esDecreciente = false; // rompe regla decreciente
            }

            anterior = digito;
            numero /= 10;
        }

        // Imprimimos el resultado
        if (esCreciente) {
            System.out.println("El número es monótono creciente");
        } else if (esDecreciente) {
            System.out.println("El número es monótono decreciente");
        } else {
            System.out.println("El número no es monótono");
        }
    }
}