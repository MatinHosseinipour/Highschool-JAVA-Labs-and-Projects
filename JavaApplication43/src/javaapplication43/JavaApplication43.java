/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import java.util.Scanner;

/**
 *
 * @author matin
 */
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println(result);
        System.out.println(factorial(num));
    }
    public static int factorial(int num){
        if (num == 1) {
            return 1;
        }
        else{
           return num*factorial(num-1);
        }
    }
    
}
