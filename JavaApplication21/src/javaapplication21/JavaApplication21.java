/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author matin
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    static int top2 = 0;
    public static void main(String[] args) {
        // TODO code application logic here
       int[] Array = {
            18,25,9,-1,5,1,0,63,49,2
        };
       int[] sorted_arrays = selection_sort(Array);
        for (int i = 0; i < sorted_arrays.length; i++) {
            System.out.print(sorted_arrays[i] + ", ");
        }
        
    }
    public static int[] selection_sort(int[] arrays){
        int temp,location,top = arrays.length-1;
        while (top > 0) {
            temp = arrays[0]; location = 0; 
            for (int j = 0; j <= top; j++) {
                if (arrays[j] > temp) {
                    temp = arrays[j];
                    location = j;
                }
            }
            temp = arrays[top];
            arrays[top] = arrays[location];
            arrays[location] = temp;
            top--;
        }
        return arrays;
    }
    
}
