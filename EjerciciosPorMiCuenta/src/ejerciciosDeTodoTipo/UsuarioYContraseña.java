package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class UsuarioYContraseña {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, suma, resta, multiplicacion, division, contadorContraseña;   // HACER CONTRASEÑA 3 INTENTOS
        
        System.out.println("Introduce un Usuario: ");
        String usuario = sc.nextLine();

        System.out.println("Introduce la contraseña de " + "'" + usuario + "'");
        String contraseña = sc.nextLine();

        if (usuario.equals("admin") && contraseña.equals("1234")) {
            System.out.println("  ✅ Clave correcta ✅ \nHAS ACCEDIDO AL SISTEMA");

            boolean salir = false;

            while (!salir) {
                System.out.println("\n🌟===================================🌟");
                System.out.println("   🚀 MENÚ PRINCIPAL DEL SISTEMA 🚀");
                System.out.println("🌟===================================🌟");
                System.out.println("1️  💡 Cálculos matemáticos");
                System.out.println("2️  🆔 Comprobar letra del DNI");
                System.out.println("3️  👶 Ver si eres mayor de edad");
                System.out.println("4️  🔮 Adivinar tu signo del zodiaco");
                System.out.println("5️  ❌ Salir del programa");
                System.out.println("🌟===================================🌟");
                System.out.println("👉 Elige una opción: ");

                int opcionMenu = sc.nextInt();

                if (opcionMenu == 1) {
                    System.out.println("🧮===================================🧮\r\n"
                            + "        ⚡ MÓDULO DE CÁLCULOS ⚡\r\n"
                            + "🧮===================================🧮\r\n"
                            + "1️  ➕ Suma  \r\n"
                            + "2️  ➖ Resta  \r\n"
                            + "3️  ✖️ Multiplicación  \r\n"
                            + "4️  ➗ División  \r\n"
                            + "5️  🧩 Módulo (resto de la división)  \r\n"
                            + "🧮===================================🧮\r\n"
                            + "👉 Elige una opción:");

                    int opcion = sc.nextInt();

                    System.out.println("Introduce el primer número: ");
                    num1 = sc.nextInt();
                    System.out.println("Introduce el segundo número: ");
                    num2 = sc.nextInt();

                    if (opcion == 1) {
                        suma = num1 + num2;
                        System.out.println("El resultado de la suma es: " + suma);
                    } else if (opcion == 2) {
                        resta = num1 - num2;
                        System.out.println("El resultado de la resta es: " + resta);
                    } else if (opcion == 3) {
                        multiplicacion = num1 * num2;
                        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
                    } else if (opcion == 4) {
                        if (num2 == 0) {
                            System.out.println("⚠️ No se puede dividir entre 0");
                        } else {
                            division = num1 / num2;
                            System.out.println("El resultado de la división es: " + division);
                        }
                    } else if (opcion == 5) {
                        division = num1 % num2;
                        System.out.println("El módulo (resto) es: " + division);
                    }

                } else if (opcionMenu == 2) {
                    System.out.println("🆔===================================🆔\r\n"
                            + "       🧠 MÓDULO COMPROBADOR DE DNI 🧠\r\n"
                            + "🆔===================================🆔\r\n"
                            + "Introduce tu número de DNI sin letra:  ");
                    int numeroDNI = sc.nextInt();

                    int resto = numeroDNI % 23;

                    String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

                    if (resto >= 0 && resto <= 22) {
                        System.out.println("Calculando letra mágica... 🔤✨ -> " + letras[resto]);
                    } else {
                        System.out.println("❌ Algo ha ido mal");
                    }

                } else if (opcionMenu == 3) {
                    System.out.println("🎂===================================🎂\r\n"
                            + "        🔞 COMPROBADOR DE EDAD 🔞\r\n"
                            + "🎂===================================🎂\r\n"
                            + "Introduce tu edad y descubre el veredicto... 👀  ");
                    int edad = sc.nextInt();

                    if (edad >= 18) {
                        System.out.println("🔞 ERES MAYOR DE EDAD 🔞");
                    } else {
                        System.out.println("No eres mayor de edad");
                    }

                } else if (opcionMenu == 4) {
                    System.out.println("🔮===================================🔮\r\n"
                            + "       🌟 JUEGO: ADIVINA TU SIGNO 🌟\r\n"
                            + "🔮===================================🔮");

                    System.out.println("Introduce tu día de nacimiento: ");
                    int dia = sc.nextInt();
                    System.out.println("Introduce tu mes de nacimiento: ");
                    int mes = sc.nextInt();

                    System.out.println("Calculando tu signo... 🌌✨  ");

                    if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) System.out.println("ERES ARIES");
                    else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) System.out.println("ERES TAURO");
                    else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) System.out.println("ERES GÉMINIS");
                    else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) System.out.println("ERES CÁNCER");
                    else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) System.out.println("ERES LEO");
                    else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) System.out.println("ERES VIRGO");
                    else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) System.out.println("ERES LIBRA");
                    else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) System.out.println("ERES ESCORPIO");
                    else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) System.out.println("ERES SAGITARIO");
                    else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) System.out.println("ERES CAPRICORNIO");
                    else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) System.out.println("ERES ACUARIO");
                    else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) System.out.println("ERES PISCIS");
                    else System.out.println("FECHA NO VÁLIDA");

                } else if (opcionMenu == 5) {
                    salir = true;
                    System.out.println("👋===================================👋\r\n"
                            + "       💾 CERRANDO EL SISTEMA 💾\r\n"
                            + "👋===================================👋\r\n"
                            + "Gracias por usar el programa 🕵️‍♂️  ");
                } else {
                    System.out.println("❌ Opción no válida ❌");
                }
            }

        } else {
            System.out.println("❌ Clave incorrecta. Prueba de nuevo ❌");
        }

        sc.close();
    }
}
