package ejerciciosDeTodoTipo;

public class CalculadoraAvanzada {

	public int calcular(int a, int b) {
		if (a > 0 && b > 0) {
			return a + b;
		} else {
			return 0;
		}

	}

	public double calcular(double a, double b) {
		if (a > 0.5 && b > 0.5) {
			return a * b;
		} else {
			return 1.0;
		}
	}

	public int calcular(String texto) {
		if(texto.length() > 5) {
			return texto.length();
		} else {
			return -1;
		}
	}


	public static void main(String[] args) {
		CalculadoraAvanzada a = new CalculadoraAvanzada();

		System.out.println("Suma: " + a.calcular(1, 5));
		System.out.println("Multiplicación: " + a.calcular(0.3, 0.9));
		System.out.println("Longitud texto: " + a.calcular("Filipacio"));
	}


}


