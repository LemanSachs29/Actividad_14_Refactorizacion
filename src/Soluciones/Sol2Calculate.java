/*
 * En este caso el método de refactorización elegido ha sido eliminar la variable temp que
 * se usa de manera repetida y sustituirla por variables representativas de cada operación.
 * Puede parecer una buena idea para ahorrar memoria, pero el uso de “variables comodín”
 * dificulta la legibilidad del código y su mantenimiento.
 */
package Soluciones;

/**
 *
 * @author Juan Blanco Moyano
 */
public class Sol2Calculate {

    public static void calculate(int a, int b) {
//Entorno:
        float suma, resta, multiplicacion, division;
//Algoritmo:

        suma = a + b;
        System.out.println("Suma of a and b: " + suma);

        resta = a - b;
        System.out.println("Diferencia of a and b: " + resta);

        multiplicacion = a * b;
        System.out.println("Producto of a and b: " + multiplicacion);

        division = a / b;
        System.out.println("Cociente of a and b: " + division);

    }
}
