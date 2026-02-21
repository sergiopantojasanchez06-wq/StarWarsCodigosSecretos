package StarWars;

import java.util.Scanner;

public class CodigosSecretos {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Ejecución de los niveles repartidos
        if (!nivel1Integrante1()) return;
        if (!nivel2y3Integrante2()) return;
        if (!nivel4Integrante3()) return;
        if (!nivel5Integrante4()) return;
    }

    // ===================== SERGIO INICIO Y NIVEL 1 =====================
    public static boolean nivel1Integrante1() {
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===");
        System.out.println("Hace mucho tiempo, en una galaxia muy, muy lejana…");
        System.out.println("La Princesa Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada");
        System.out.println("en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio está construyendo para destruirla.");
        System.out.println("(Presiona Intro para continuar)");
        sc.nextLine();

        int S1 = (int) (1 + Math.random() * 10);
        int S2 = (int) (20 + Math.random() * (30 - 20 + 1));

        System.out.println("\nNIVEL 1");
        System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta el sistema " + S1 +
                " en el sector " + S2 + ", pero el sistema de navegación está estropeado y el computador");
        System.out.println("tiene problemas para calcular parte de las coordenadas de salto.");
        System.out.println("Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.");
        System.out.println("Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que");
        System.out.println("calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).");
        System.out.println("¿Qué debe introducir?");

        int suma = 0;
        for (int i = S1; i <= S2; i++) {
            suma += i;
        }

        if (sc.nextInt() != suma) {
            perder();
            return false;
        }
        return true;
    }
    
    // ===================== ZHUOXUAN: NIVEL 2 Y NIVEL 3 =====================
    public static boolean nivel2y3Integrante2() {
        // NIVEL 2
        int P1 = (int) (1 + Math.random() * 7);
        int P2 = (int) (8 + Math.random() * (12 - 8 + 1));

        System.out.println("\nNIVEL 2");
        System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella de la muerte.");
        System.out.println("Como van en una nave imperial robada se aproximan lentamente con la intención de pasar desapercibidos.");
        System.out.println("De repente suena el comunicador.");
        System.out.println("\"Aquí agente de espaciopuerto " + P1 + " contactando con nave imperial " + P2 + ".");
        System.out.println("No están destinados en este sector. ¿Qué hacen aquí?\"");
        System.out.println("Han Solo coge el comunicador e improvisa.");
        System.out.println("\"Eh… tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso para atracar y reparar la nave\".");
        System.out.println("El agente responde: \"Proporcione código de acceso o abriremos fuego\".");
        System.out.println("Han Solo consulta el manual del piloto.");
        System.out.println("El código es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).");
        System.out.println("¿Cuál es el código?");

        long producto = 1;
        for (int i = P1; i <= P2; i++) {
            producto *= i;
        }

        if (sc.nextLong() != producto) {
            perder();
            return false;
        }

        // NIVEL 3
        int N = (int) (50 + Math.random() * (100 - 50 + 1));
        int numeroFactorial = N / 10;

        System.out.println("\nNIVEL 3");
        System.out.println("Han Solo proporciona el código correcto.");
        System.out.println("Atracan en la estrella de la muerte y se equipan con trajes imperiales.");
        System.out.println("Ahora deben averiguar en qué nivel de los " + N + " existentes se encuentra el reactor principal.");
        System.out.println("La Princesa Leia recuerda la información de Lando Calrissian:");
        System.out.println("\"La clave de acceso es el factorial de N/10 (redondeando hacia abajo)\".");
        System.out.println("¿Cuál es el nivel correcto?");

        long factorial = 1;
        for (int i = 1; i <= numeroFactorial; i++) {
            factorial *= i;
        }

        if (sc.nextLong() != factorial) {
            perder();
            return false;
        }
        return true;
    }
    
 // ===================== ALEJO: NIVEL 4 =====================
    public static boolean nivel4Integrante3() {
        int P = (int) (10 + Math.random() * (100 - 10 + 1));

        System.out.println("\nNIVEL 4");
        System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta acorazada.");
        System.out.println("R2D2 se conecta al panel para hackear el sistema.");
        System.out.println("Para desencriptar la clave necesita verificar si el número " + P + " es primo.");
        System.out.println("Introduce 1 si es primo o 0 si no lo es.");


        boolean esPrimo = true;
        if (P < 2) {
            esPrimo = false;
        } else {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    esPrimo = false;
                }
            }
        }

        int resultadoPrimo = esPrimo ? 1 : 0;

        if (sc.nextInt() != resultadoPrimo) {
            perder();
            return false;
        }
        return true;
    }

	//===================== INTEGRANTE 4: NIVEL 5 Y FINAL =====================
	public static boolean nivel5Integrante4() {
    int M = (int) (5 + Math.random() * (10 - 5 + 1));
    int S = (int) (5 + Math.random() * (10 - 5 + 1));

    System.out.println("\nNIVEL 5");
    System.out.println("Consiguen entrar al reactor.");
    System.out.println("Luke debe programar el temporizador para que explote en exactamente " + M + " minutos y " + S + " segundos.");
    System.out.println("El reloj Zordgiano convierte el tiempo sumando factorial(M) + factorial(S).");
    System.out.println("¿Qué valor debe introducir?");

    long factorialM = 1;
    for (int i = 1; i <= M; i++) {
        factorialM *= i;
    }

    long factorialS = 1;
    for (int i = 1; i <= S; i++) {
        factorialS *= i;
    }

    long resultadoFinal = factorialM + factorialS;

    if (sc.nextLong() != resultadoFinal) {
        perder();
        return false;
    }

    // GANAR
    System.out.println("\nLuke Skywalker introduce el tiempo correcto...");
    System.out.println("¡La estrella de la muerte explota!");
    System.out.println("¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
    System.out.println("\nGracias por jugar :D");
    return true;
	}

	public static void perder() {
    System.out.println("\nEse no era el código correcto…");
    System.out.println("La misión ha sido un fracaso… :( :( :(");
    System.out.println("Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
    System.out.println("\nGracias por jugar :D");
	}
}