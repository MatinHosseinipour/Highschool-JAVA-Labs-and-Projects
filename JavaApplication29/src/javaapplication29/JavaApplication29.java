/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

/**
 *
 * @author matin
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 213213, num2 = 3;
        
        boolean bool = isDivisible(num1, num2);
        
        if (bool) {
            System.out.println("Is Divisible");
        }
        else{
            System.out.println("Is not Diswjkl7890gf 7890visible");
        }
    }
    public static boolean isDivisible(int num1, int num2){
        if (num1 % num2 == 0) {
            return true;
        }
        else{
            return false;
        }
    }
}
