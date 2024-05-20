/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Enunciados;

/**
 *
 * @author Juan Blanco Moyano
 */
public class E3 {

    public static void main(String[] args) {
        int[] nums = new int[10];
        
        
        for (int i = 0; i < 10; i++) {
            nums[i] = (int) (Math.random() * 100) + 1;
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i] * 3;
            } else {
                sum += nums[i] * 2;
            }
        }
        System.out.println("Suma de los números pares e impares multiplicados"
                + "por 3 y 2 respectivamente: "+sum);
}
}

