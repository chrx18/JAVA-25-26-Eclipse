package miPrimerPrograma;

public class TiposDeDatos {

	public static void main(String[] args) {
		// Vamos a probar los tipos de datos boolean

		// Tipos caracter 
		
		String frase; // Variable donde guardar un texto largo
		char letra; // Variable donde solo cabe una letra
		
		frase = "Hola \n a todo\ts";
		letra = 'a';
		letra = '\t'; // Caracter tabulador	
		letra = '\n'; // Caracter intro
		
		System.out.println(frase);
		
		// Tipos numericos enteros
		
		byte pequeña;
		short mediana;
		int grande;
		long enorme;
		
		pequeña = 16;
		mediana = 20000;
		grande = 1434324324;
		enorme = 473829437289437L;
		
		
		float pocosDecimales;
		double muchosDecimales;
		
		pocosDecimales = 1324893543.324234324F;
		muchosDecimales = 3482903829409032.342432483290;
		
		pequeña ++;
		pequeña = (byte) (pequeña - 1);
		System.out.println(pequeña);
		
		boolean resultado; 
		resultado = mediana > grande;
		System.out.println(resultado);
		
		//probar los operadores lógicos
		
		boolean hayToner = true;
		boolean hayPapel = true;
		
		resultado = hayToner && hayPapel;
		
		System.out.println("Puedo imprimir?: " + resultado);
		
		boolean familiaNumerosa = true;
		boolean rentaFamiliarBaja = true;
		
		resultado = familiaNumerosa || rentaFamiliarBaja;
		
		System.out.println("¿Me daran beca?: " + resultado);
		int aa = 2025;
		int an = 2005;
		int ma = 2025;
		int mn = 2005;
		int da = 2025;
		int dn		 = 2005;
		boolean cumple = da == dn && ma == mn && aa - an == 20;
		
		System.out.println(cumple);
	}

}
