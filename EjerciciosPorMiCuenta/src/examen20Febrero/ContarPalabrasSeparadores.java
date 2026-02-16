package examen20Febrero;

public class ContarPalabrasSeparadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contadorPalabras = 0;
		
		String texto = "Hola a todos.Adios";
		
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);

			if (c != ' ' && c != '.' && c != ',') {

				if (i == 0 || 
						texto.charAt(i - 1) == ' ' ||
						texto.charAt(i - 1) == '.' ||
						texto.charAt(i - 1) == ',') {
					contadorPalabras++;
				}
				
			}
		
		}

		
		System.out.println("Contador de palabras: " + contadorPalabras);
		
	}

}
