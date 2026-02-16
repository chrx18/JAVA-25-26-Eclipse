package examen20Febrero;

public class ComprobarPalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean Palindromo = true;
		String texto = "oso";

		for (int i = 0; i < texto.length() / 2; i++) {
			if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
				Palindromo = false;
				break;
			}
		}
		
		System.out.println(Palindromo);
		
	}

}
