package examen20Febrero;

public class ContarConsonantesSinEspacios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contadorConsonantes = 0;
		
		String texto = "Hola a todos";
		
		for (int i = 0; i < texto.length(); i++) {
			char c = Character.toLowerCase(texto.charAt(i));
			
			if (Character.isLetter(c) && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
				contadorConsonantes++;
			}
		}

		System.out.println("Numero de consonantes sin espacios: " + contadorConsonantes);
		
	}

}
