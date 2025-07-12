package Fisica;

/**
 * La clase Movimiento representa un movimiento rectilíneo
 * con posición inicial, velocidad inicial y aceleración constante.
 * Permite calcular posición, velocidad, distancia, y energía cinética.
 * 
 * @author Diaz Reyes Jonathan Eleazar
 * @author Gael Martinez Cruz
 * @version 1.0
 */
public class Movimiento {

    private double x0; // posición inicial
    private double v0; // velocidad inicial
    private double a;  // aceleración

    /**
     * Crea un objeto Movimiento con posición, velocidad y aceleración dadas.
     * 
     * @param x0 Posición inicial
     * @param v0 Velocidad inicial
     * @param a Aceleración
     */
    public Movimiento(double x0, double v0, double a) {
        this.x0 = x0;
        this.v0 = v0;
        this.a = a;
    }

    /**
     * Calcula la posición en un tiempo dado.
     * 
     * @param t Tiempo
     * @return Posición final
     */
    public double posicion(double t) {
        return x0 + v0 * t + 0.5 * a * t * t;
    }

    /**
     * Calcula la velocidad en un tiempo dado.
     * 
     * @param t Tiempo
     * @return Velocidad final
     */
    public double velocidad(double t) {
        return v0 + a * t;
    }

    /**
     * Verifica si el movimiento es uniforme (MRU).
     * 
     * @return true si la aceleración es cero, false en otro caso
     */
    public boolean esMRU() {
        return a == 0;
    }

    /**
     * Verifica si el movimiento es uniformemente acelerado (MRUA).
     * 
     * @return true si hay aceleración, false en otro caso
     */
    public boolean esMRUA() {
        return a != 0;
    }

    /**
     * Determina si el movimiento es válido (si hay velocidad o aceleración).
     * 
     * @return true si existe movimiento, false si está en reposo absoluto
     */
    public boolean esMovimientoValido() {
        return !(v0 == 0 && a == 0);
    }

    /**
     * Calcula la distancia recorrida entre dos instantes de tiempo.
     * 
     * @param tInicio Tiempo inicial
     * @param tFin Tiempo final
     * @return Distancia absoluta recorrida
     */
    public double distanciaRecorrida(double tInicio, double tFin) {
        return Math.abs(posicion(tFin) - posicion(tInicio));
    }

    /**
     * Calcula la energía cinética en un instante de tiempo.
     * 
     * @param masa Masa del objeto
     * @param t Tiempo
     * @return Energía cinética
     */
    public double energiaCinetica(double masa, double t) {
        double v = velocidad(t);
        return 0.5 * masa * v * v;
    }

    /**
     * Genera un arreglo con velocidades en diferentes tiempos.
     * 
     * @param tInicio Tiempo inicial
     * @param tFin Tiempo final
     * @param intervalo Intervalo de tiempo entre mediciones
     * @return Arreglo de velocidades
     */
    public double[] generarVelocidades(double tInicio, double tFin, double intervalo) {
        int n = (int) ((tFin - tInicio) / intervalo) + 1;
        double[] velocidades = new double[n];
        for (int i = 0; i < n; i++) {
            double t = tInicio + i * intervalo;
            velocidades[i] = velocidad(t);
        }
        return velocidades;
    }

    /**
     * Obtiene la posición inicial.
     * 
     * @return Posición inicial
     */
    public double getX0() {
        return x0;
    }

    /**
     * Obtiene la velocidad inicial.
     * 
     * @return Velocidad inicial
     */ 
   public double getV0() {
        return v0;
    }

    /**
     * Obtiene la aceleración.
     * 
     * @return Aceleración
     */
    public double getA() {
        return a;
    }
}