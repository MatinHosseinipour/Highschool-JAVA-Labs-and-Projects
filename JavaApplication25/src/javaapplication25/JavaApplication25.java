/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.Scanner;

/**
 *
 * @author matin
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of fractions you wish to get");
        int quan = sc.nextInt();
        equalf eq = new equalf();
        eq.equal_functions(quan);
    }
    
}
class equalf{
    int num = 5;
    int den = 7;
    
    void equal_functions(int quantity){
        for (int i = 1; i <= quantity; i++) {
            System.out.println(num*i + "/" + den*i);
        }
    }
}