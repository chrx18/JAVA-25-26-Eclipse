package ejerciciosDeTodoTipo;

public class SaludoMetodos {
	
	public void saludar() {
		System.out.println("Hola!");
	}
	
	public void saludar(String nombre) {
		System.out.println("Hola, " + nombre);
	}
	
	
	
	
	public static void main(String[] args) {
		SaludoMetodos a = new SaludoMetodos();
		
		a.saludar();
		a.saludar("Alberto");
	}
	

}
