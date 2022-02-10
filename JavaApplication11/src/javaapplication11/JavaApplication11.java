/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author matin
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        int a[][] = {
            {1,0,12,-1},
            {7,-3,2,5},
            {-5,-2,2,-9}
        };
        for (int i = 0; i < a.length; i++) {
            for (int q = 0; q < a[0].length; q++) {
                System.out.print(a[i][q] + "\t");
                sum += a[i][q];
            }
            System.out.println("");
        }
        System.out.println(sum);
    }
}
