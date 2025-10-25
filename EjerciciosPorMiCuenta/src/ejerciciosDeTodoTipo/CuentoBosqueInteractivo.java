package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class CuentoBosqueInteractivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean mueres = false;
        boolean seguirJugando = true;
        boolean tieneMapa = false;
        boolean tieneLinterna = true;
        boolean tieneProvisiones = false;
        boolean tieneTesoro = false;

        int opcionPrimera, decision1, decision2;

        while (seguirJugando && !mueres) {

            System.out.println("🌲============================================🌲");
            System.out.println("       BIENVENIDO AL BOSQUE MISTERIOSO 🌙");
            System.out.println("🌲============================================🌲");
            System.out.println("Te despiertas en medio de un bosque oscuro...");
            System.out.println("No recuerdas cómo has llegado hasta aquí.");
            System.out.println("Solo tienes una linterna y una mochila vacía.\n");

            System.out.println("1️ Caminar hacia el norte 🌄");
            System.out.println("2️ Explorar una cabaña abandonada 🏚️");
            System.out.println("3️ Gritar pidiendo ayuda 📢");
            System.out.println("4️ Quedarte quieto y esperar");
            System.out.println("5️ Seguir el sendero del oeste 🌲");
            System.out.println("👉 ¿Qué harás?");
            opcionPrimera = sc.nextInt();

            if (opcionPrimera == 1) {
                System.out.println("Llegas a un río de agua helada ❄️");
                System.out.println("Hay un puente de madera roto y un sendero que sigue el río.");
                System.out.println("1. Cruzar puente  2. Seguir río  3. Nadar");
                decision1 = sc.nextInt();

                if (decision1 == 1) {
                    System.out.println("El puente se rompe, pero logras aferrarte. Pierdes la linterna.");
                    tieneLinterna = false;

                    System.out.println("1. Buscar ayuda  2. Seguir explorando");
                    decision2 = sc.nextInt();

                    if (decision2 == 1) {
                        System.out.println("Un cazador te encuentra y te lleva a la aldea. 🏆");
                    } else {
                        System.out.println("Te pierdes en la oscuridad y mueres. ❌");
                        mueres = true;
                    }
                }

                if (decision1 == 2) {
                    System.out.println("Encuentras una barca vieja.");
                    System.out.println("1. Remar río abajo  2. Ir por sendero cercano  3. Ignorar la barca");
                    decision2 = sc.nextInt();

                    if (decision2 == 1) {
                        System.out.println("El río te lleva a una cascada. MUERES 💀");
                        mueres = true;
                    } else if (decision2 == 2) {
                        System.out.println("Encuentras un puente seguro y cruzas al otro lado 🌄");
                    } else {
                        System.out.println("Pierdes tiempo y se hace de noche. Lobos te atacan. ❌");
                        mueres = true;
                    }
                }

                if (decision1 == 3) {
                    System.out.println("El agua está helada. Mueres de hipotermia. ❌");
                    mueres = true;
                }
            }

            if (opcionPrimera == 2) {
                System.out.println("Dentro hay una mesa polvorienta, un cofre cerrado y una chimenea apagada.");
                System.out.println("1. Abrir cofre  2. Encender fuego  3. Subir al desván  4. Buscar debajo de la cama");
                decision1 = sc.nextInt();

                if (decision1 == 1) {
                    System.out.println("El cofre contenía un mapa del bosque. 🗺️");
                    tieneMapa = true;

                    System.out.println("1. Salir de la cabaña  2. Seguir explorando");
                    decision2 = sc.nextInt();

                    if (decision2 == 1) {
                        System.out.println("Sigues el mapa y llegas a un claro seguro. 🏕️");
                    } else {
                        System.out.println("Te quedas demasiado y aparece un oso. MUERES 💀");
                        mueres = true;
                    }
                }

                if (decision1 == 2) {
                    System.out.println("El humo atrae a algo... MUERES 💀");
                    mueres = true;
                }

                if (decision1 == 3) {
                    System.out.println("Encuentras un cuaderno con pistas y una linterna extra. 🔦");
                    tieneLinterna = true;
                }

                if (decision1 == 4) {
                    System.out.println("Encuentras unas provisiones y las guardas en tu mochila. 🥖🍎");
                    tieneProvisiones = true;
                }
            }

            if (opcionPrimera == 3) {
                System.out.println("Escuchas pasos entre los árboles...");
                System.out.println("1. Esconderte  2. Esperar  3. Correr  4. Lanzar piedras para distraer");
                decision1 = sc.nextInt();

                if (decision1 == 1) {
                    System.out.println("Un cazador te encuentra y te ayuda a salir. 🏆");
                }

                if (decision1 == 2) {
                    System.out.println("Una figura aparece detrás de ti... MUERES 💀");
                    mueres = true;
                }

                if (decision1 == 3) {
                    System.out.println("Tropiezas y mueres. ❌");
                    mueres = true;
                }

                if (decision1 == 4) {
                    System.out.println("Has distraído a la figura y puedes escapar por un sendero seguro 🌄");
                }
            }

            if (opcionPrimera == 4) {
                System.out.println("La noche cae y escuchas lobos...");
                System.out.println("1. Encender fogata  2. Trepar a un árbol  3. Dormir  4. Correr hacia la cabaña");
                decision1 = sc.nextInt();

                if (decision1 == 1) {
                    System.out.println("El fuego atrae animales. MUERES 💀");
                    mueres = true;
                }

                if (decision1 == 2) {
                    System.out.println("Desde el árbol ves una aldea al amanecer 🌄");
                }

                if (decision1 == 3) {
                    System.out.println("Los lobos te rodean... fin. ❌");
                    mueres = true;
                }

                if (decision1 == 4) {
                    System.out.println("Llegas a la cabaña y encuentras un escondite seguro 🏚️");
                }
            }

            if (opcionPrimera == 5) {
                System.out.println("Te adentras en un bosque más espeso...");
                System.out.println("1. Seguir por el sendero  2. Cortar camino  3. Explorar ruinas antiguas  4. Entrar en cueva oscura");
                decision1 = sc.nextInt();

                if (decision1 == 1) {
                    System.out.println("Llegas a un claro con una aldea abandonada 🏚️");
                }

                if (decision1 == 2) {
                    System.out.println("Te pierdes entre los árboles y caes en un barranco. ❌");
                    mueres = true;
                }

                if (decision1 == 3) {
                    System.out.println("Encuentras un tesoro escondido. Puedes llevarlo contigo 💰");
                    tieneTesoro = true;
                    seguirJugando = false;
                }

                if (decision1 == 4) {
                    if (tieneLinterna) {
                        System.out.println("Exploras la cueva y encuentras un camino secreto seguro 🌟");
                    } else {
                        System.out.println("Está demasiado oscuro. Tropiezas y mueres. ❌");
                        mueres = true;
                    }
                }
            }

            if (mueres) {
                System.out.println("\n💀 Has muerto en el bosque misterioso... 💀");
                System.out.println("¿Quieres intentarlo de nuevo? (si/no): ");
                String respuesta = sc.next();

                if (respuesta.equalsIgnoreCase("si")) {
                    mueres = false;
                    tieneMapa = false;
                    tieneLinterna = true;
                    tieneProvisiones = false;
                    tieneTesoro = false;
                } else {
                    seguirJugando = false;
                    System.out.println("🏕️ Fin de la aventura. Gracias por jugar. 🏕️");
                }

            } else if (!seguirJugando && tieneTesoro) {
                System.out.println("\n💰 ¡HAS ENCONTRADO EL TESORO PERDIDO DEL BOSQUE! 💰");
                System.out.println("\n--- INVENTARIO FINAL ---");
                
                if (tieneMapa) System.out.println("🗺️ Mapa del bosque");
                
                if (tieneLinterna) System.out.println("🔦 Linterna");
                
                if (tieneProvisiones) System.out.println("🥖 Provisiones");
                
                if (tieneTesoro) System.out.println("💰 Tesoro legendario");

            } else if (seguirJugando) {
                System.out.println("\n¿Quieres seguir explorando el bosque? (si/no): ");
                String respuesta = sc.next();

                if (!respuesta.equalsIgnoreCase("si")) {
                    seguirJugando = false;
                    System.out.println("🏕️ Fin de la aventura. Has sobrevivido al bosque. 🏕️");

                    System.out.println("\n--- INVENTARIO FINAL ---");
                    
                    if (tieneMapa) System.out.println("🗺️ Mapa del bosque");
                    
                    if (tieneLinterna) System.out.println("🔦 Linterna");
                    
                    if (tieneProvisiones) System.out.println("🥖 Provisiones");
                    
                    if (tieneTesoro) System.out.println("💰 ¡Y has conseguido el tesoro escondido! 💰");
                    
                }
            }
        }
    }
}
