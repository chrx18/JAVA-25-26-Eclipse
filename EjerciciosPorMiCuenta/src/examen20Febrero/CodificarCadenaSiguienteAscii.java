package examen20Febrero;

public class CodificarCadenaSiguienteAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "Hola a todo el mundo";
		StringBuilder resultado = new StringBuilder();
		
		
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
		
			char nuevo = (char) (c+1);
			resultado.append(nuevo);
			
		}

		System.out.println(resultado);
		
	}

}
