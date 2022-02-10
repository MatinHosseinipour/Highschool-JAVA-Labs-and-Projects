/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author matin
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] Array = {
            18,25,9,-1,5,1,0,63,49,2
        };
        int[] sorted_Array = bubble_sort(Array);
        for (int i = 0; i < sorted_Array.length; i++) {
            System.out.print(sorted_Array[i] + ", ");
        }
    }
    public static int[] bubble_sort(int[] arrays){
        int temp;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 1; j < arrays.length; j++) {
                if (arrays[j] < arrays[j-1]) {
                    temp = arrays[j];
                    arrays[j] = arrays[j-1];
                    arrays[j-1] = temp;
                }
            }
        }
        return arrays;
    }
}
