/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author matin
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][] = {
            {1,0,12,-1},
            {7,-3,2,5},
            {-5,-2,2,-9}
        };
        int max = a[0][0];
        for (int[] a1 : a) {
            for (int q = 0; q < a[0].length; q++) {
                System.out.print(a1[q] + "\t");
                if (max <= a1[q]) {
                    max = a1[q];
                }
            }
            System.out.println("");
        }
        System.out.println(max);
    }
    
}