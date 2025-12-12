package ejerciciosDeTodoTipo;

public class Presentacion {

	public void presentarse() {
		System.out.println("Hola. Me presento.");
	}
	
	public void presentarse(String nombre) {
		System.out.println("Hola. Me llamo " + nombre);
	}
	
	public void presentarse (String nombre, int edad) {
		System.out.println("Hola. Me llamo " + nombre + " y tengo " + edad + " años.");
	}
	
	
	
	public static void main(String[] args) {
		Presentacion p = new Presentacion();
		
		p.presentarse();
		p.presentarse("Alberto");
		p.presentarse("Alberto", 29);
	}
}
