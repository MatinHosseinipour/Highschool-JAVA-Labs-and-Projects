/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author matin
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 9;
        boolean prime = true;
        for (int i = 2; i <= number/2; i++) {
            if (number%i == 0) {
                System.out.println("It is not prime");
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("Its is prime");
        }
    }
    
}
