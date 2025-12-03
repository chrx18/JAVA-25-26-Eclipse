package ejerciciosDeTodoTipo;

public class LimpiarEspaciosDobles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder("Hola   mundo   que   tal");

		for (int i = 0; i < sb.length() - 1; i++) {

			if (sb.charAt(i) == ' ' && sb.charAt(i + 1) == ' ') {
				sb.delete(i, i + 1); 
				i--;
			}
		}

		System.out.println(sb); 

	}

}
