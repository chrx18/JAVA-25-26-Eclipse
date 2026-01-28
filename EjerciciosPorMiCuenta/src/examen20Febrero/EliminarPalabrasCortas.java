package examen20Febrero;

public class EliminarPalabrasCortas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String texto = "El bar de la plaza";

        StringBuilder palabraActual = new StringBuilder();
        StringBuilder resultado = new StringBuilder();
        

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c != ' ') {
                palabraActual.append(c);
            } else {
                if (palabraActual.length() >= 3) {
                    resultado.append(palabraActual).append(" ");
                }
                palabraActual.setLength(0);
            }
        }

        if (palabraActual.length() >= 3) {
            resultado.append(palabraActual);
        }

        System.out.println(resultado.toString());
    }
}