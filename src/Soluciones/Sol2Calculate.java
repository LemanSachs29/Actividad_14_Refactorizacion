/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
