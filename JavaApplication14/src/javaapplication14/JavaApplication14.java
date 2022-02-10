/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author matin
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] a = {
            {7,9,1,3},
            {-9,-5,1,6},
            {12,36,0,2}
        };
        int[][] b = {
            {-5,4,8,4},
            {-2,3,-9,15},
            {0,-6,-25,7}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[i][j] += a[i][j];
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
