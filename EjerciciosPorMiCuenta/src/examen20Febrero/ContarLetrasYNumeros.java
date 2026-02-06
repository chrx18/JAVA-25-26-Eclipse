package examen20Febrero;

public class ContarLetrasYNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contadorLetras = 0, contadorNumeros = 0;
		
		String texto = "Hola123 Mundo45";

		for (int i = 0; i < texto.length(); i++) {
			char c = Character.toLowerCase(texto.charAt(i));
			
			if (Character.isDigit(c)) {
				contadorNumeros++;
			} else if (Character.isLetter(c)) {
				contadorLetras++;
			}
		}
		
		System.out.println("Numeros: " + contadorNumeros);
		System.out.println("Letras: " + contadorLetras);
	}

}
