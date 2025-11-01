package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ValidacionDeContraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

		final String contraseña = "EjerciciosJava2025";
		String intento;
		int contadorIntentos = 0;
			
		do {
			
			System.out.println("Introduce la Contraseña: ");
			intento = sc.next();
			
			if (!intento.equals(contraseña)) {
				System.out.println("Contraseña Incorrecta. Intentalo de nuevo.");
			}
					
		} while (!intento.equals(contraseña) && contadorIntentos < 3);
		
		
		if (intento.equals(contraseña)) {
			System.out.println("HAS ACCEDIDO AL SISTEMA");
		} else {
			System.out.println("DEMASIADOS INTENTOS. BLOQUEO DE 10 HORAS");
		}
	}
}
