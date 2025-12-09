package ejerciciosDeTodoTipo;

public class ReemplazarPorNumeroPorLetraAbecedario {

	public static void main(String[] args) {

		String entrada = "wiwiwiwiwiwwiwiwiwi";
		String resultado = convertir(entrada);

		System.out.println(resultado);
	}

	public static String convertir(String texto) {

		texto = texto.toLowerCase();
		String resultado = "";

		for (int i = 0; i < texto.length(); i++) {

			char c = texto.charAt(i);

			if (c >= 'a' && c <= 'z') {
				int posicion = c - 'a' + 1;
				resultado += posicion + " ";
			}
		}

		return resultado.trim();
	}
}
