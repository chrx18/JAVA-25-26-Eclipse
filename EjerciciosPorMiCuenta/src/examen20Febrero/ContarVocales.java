package examen20Febrero;

public class ContarVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "Invierno";
		int contadorVocales = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			char c = Character.toLowerCase(texto.charAt(i));
			
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				contadorVocales++;
				
			}
		}
		
		System.out.println("Numero total de vocales = " + contadorVocales);
		
	}

}
