package implementacion;

/**
 *
 * @author diazj
 */
import java.util.Scanner;
import Fisica.Movimiento;

public class Implementacion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingresa posicion inicial (x₀): ");
        double x0 = sc.nextDouble();
        System.out.print("Ingresa velocidad inicial (v₀): ");
        double v0 = sc.nextDouble();
        System.out.print("Ingresa aceleracion (a): ");
        double a = sc.nextDouble();

        Movimiento m = new Movimiento(x0, v0, a);

        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Mostrar posiciones y velocidades");
            System.out.println("2. Ver tipo de movimiento");
            System.out.println("3. Calcular distancia recorrida");
            System.out.println("4. Calcular energia cinetica");
            System.out.println("5. Mostrar velocidades en arreglo");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Hasta que tiempo deseas simular? ");
                    double tFin = sc.nextDouble();
                    System.out.print("Intervalo (en segundos)? ");
                    double intervalo = sc.nextDouble();

                    for (double t = 0; t <= tFin; t += intervalo) {
                        System.out.printf("t = %.1f s | x = %.2f m | v = %.2f m/s%n",
                                t, m.posicion(t), m.velocidad(t));
                    }
                }
                case 2 -> {
                    System.out.println("Tipo de movimiento: " + (m.esMRU() ? "MRU" : "MRUA"));
                    System.out.println("¿Movimiento valido? " + (m.esMovimientoValido() ? "Si" : "No"));
                }
                case 3 -> {
                    System.out.print("Tiempo inicial: ");
                    double ti = sc.nextDouble();
                    System.out.print("Tiempo final: ");
                    double tf = sc.nextDouble();
                    System.out.printf("Distancia recorrida: %.2f m%n", m.distanciaRecorrida(ti, tf));
                }
                case 4 -> {
                    System.out.print("Masa del objeto (kg): ");
                    double masa = sc.nextDouble();
                    System.out.print("En que tiempo? ");
                    double t = sc.nextDouble();
                    System.out.printf("Energia cinetica: %.2f J%n", m.energiaCinetica(masa, t));
                }
                case 5 -> {
                    System.out.print("Tiempo inicial: ");
                    double ti = sc.nextDouble();
                    System.out.print("Tiempo final: ");
                    double tf = sc.nextDouble();
                    System.out.print("Intervalo: ");
                    double intervalo = sc.nextDouble();
                    double[] velocidades = m.generarVelocidades(ti, tf, intervalo);
                    for (int i = 0; i < velocidades.length; i++) {
                        double t = ti + i * intervalo;
                        System.out.printf("t = %.1f s → v = %.2f m/s%n", t, velocidades[i]);
                    }
                }
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no valida.");
            }

        } while (opcion != 0);

       
    }
}