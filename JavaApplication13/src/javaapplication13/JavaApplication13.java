/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author matin
 */
public class JavaApplication13 {

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
        int b[][] = a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[i][j] = (int) Math.pow(a[i][j], 2); 
                System.out.print(b[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}
