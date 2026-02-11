package examen20Febrero;

public class EliminarPalabrasCortas {

    public static void main(String[] args) {
        String texto = "El perro de Juan corre rápido";
        
        StringBuilder palabraActual = new StringBuilder();
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            
            if (c != ' ') {
                palabraActual.append(c);
                
            } else {
            	
                if (palabraActual.length() >= 4) {
                    if (resultado.length() > 0) {
                        resultado.append(" ");
                    }
                    resultado.append(palabraActual);
                }
                palabraActual.setLength(0);
            }
        }

        if (palabraActual.length() >= 4) {
            if (resultado.length() > 0) {
                resultado.append(" ");
            }
            resultado.append(palabraActual);
        }
        
        System.out.println(resultado.toString());
    }
}
