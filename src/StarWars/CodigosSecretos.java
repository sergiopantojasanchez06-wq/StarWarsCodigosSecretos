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
        System.out.println("Debes calcular el sumatorio entre " + S1 + " y " + S2 + " (ambos inclusive).");

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
        System.out.println("Calcula el productorio entre " + P1 + " y " + P2 + " (ambos inclusive).");

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
        System.out.println("Si N = " + N + ", calcula el factorial de " + numeroFactorial);

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