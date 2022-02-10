/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

import java.util.Scanner;

/**
 *
 * @author matin
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        number = func(number);
        System.out.println(number);
    }
    public static int func(int num){
        if (num < 0) {
            num = num * num;
        }
        else{
            num = num*num*num;
        }
        return num;
    }
}
