package examen20Febrero;

public class ContarConsonantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contadorConsonantes = 0;
		
		
		String texto = "Programar";
		
		for (int i = 0; i < texto.length(); i++) {
			char c = Character.toLowerCase(texto.charAt(i));
			
			if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
				contadorConsonantes++;
			}
			
		}
		
		System.out.println("Contador consonantes: " + contadorConsonantes);
	}

}
