/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Soluciones;

/**
 *
 * @author Juan Blanco Moyano
 */
public class Sol3 {

    public static void main(String[] args) {
//Entorno:
        final int CANTNUMS = 10;
        
        /**
         * Al tratarse de un arreglo, utilizamos el atributo length con el que
         * cuenta. En otros casos es mejor usar la constante CANTNUMS.
         */
        int[] nums = new int[CANTNUMS];
        for (int i = 0; i < nums.length; i++) {
            nums[ i] = (int) (Math.random() * 100) + 1;
        }
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[ i] % 2 == 0) {
                sum += nums[ i] * 3;
            } else {
                sum += nums[ i] * 2;
            }
        }
        System.out.println("Suma de los números pares e impares "
                + "multiplicados por 3 y 2 respectivamente: " + sum);

    }
}
