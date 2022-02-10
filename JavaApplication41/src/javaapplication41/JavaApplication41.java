/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

import java.util.Scanner;

/**
 *
 * @author matin
 */
public class JavaApplication41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        boolean caps = false;
        int n = 0;
        String input;
        String result = "";
        while(n<3 || n > 100){
            System.out.println("Please enter the length of your actions. (3-100)");
            n = sc.nextInt();
        }
        System.out.println("Please enter either your word or CAPS");
        while(n>0){
            input = sc2.nextLine();
            if (input.toUpperCase().equals("CAPS")) {
                caps = !caps;
            }
            else{
                if (caps) {
                    result += input.toUpperCase();
                }
                else{
                    result += input;
                }
            }
            n--;
        }
        System.out.println("Here becomes your result " + result);
    }
}
