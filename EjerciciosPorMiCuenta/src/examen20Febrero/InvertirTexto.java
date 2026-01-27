package examen20Febrero;

public class InvertirTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		
		String texto = "Hola Mundo";
		
		for (int i = texto.length() - 1; i >= 0; i--) {
		    sb.append(texto.charAt(i));
		}
		
		String invertido = sb.toString();
		
		System.out.println("Texto invertido: " + invertido);
	}
	


}
