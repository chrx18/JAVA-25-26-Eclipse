package ejerciciosDeTodoTipo;

public class AreasMetodos {
	
	public int area (int lado) {
	return lado * lado;	

	}
	
	public int area (int base, int altura) {
		return base * altura;
	}
	
	public double area (double radio) {
		return Math.PI * radio * radio;
	}
	
	
	
	
	

	public static void main(String[] args) {
		AreasMetodos a = new AreasMetodos();
		
        System.out.println("Área cuadrado: " + a.area(5));
        System.out.println("Área rectángulo: " + a.area(5, 10));
        System.out.println("Área círculo: " + a.area(3.0));
	}

}
