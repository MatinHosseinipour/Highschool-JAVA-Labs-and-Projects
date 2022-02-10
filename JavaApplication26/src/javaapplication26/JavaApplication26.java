/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author matin
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the numerator");
        int num = sc.nextInt();
        System.out.println("please enter the denominator");
        int den = sc.nextInt();
        reciprocal recip = new reciprocal();
        recip.function(num, den);
    }
    
}
class reciprocal{
    void function(int num, int den){
        System.out.println("Reciprocal of " + num + "/" + den);
        System.out.println("Is : " + den + "/" + num);
    }
}