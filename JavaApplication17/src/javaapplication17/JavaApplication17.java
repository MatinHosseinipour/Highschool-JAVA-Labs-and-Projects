/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author matin
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to Fibonacci");
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = 0;
        while(num1<num){
            System.out.print(fibo(num1)+", ");
            num1++;
            if (fibo(num1)> 100) {
                break;
            }
        }
    }
    public static int fibo(int num){
        switch (num) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return (fibo(num-1)+fibo(num-2));
        }
    }
}
