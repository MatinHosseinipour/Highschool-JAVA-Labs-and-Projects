/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

/**
 *
 * @author matin
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max = 100;
        boolean prime1,prime2;
        for (int i = 2; i <= max; i++) {
            prime1= prime(i);
            if (prime1) {
                prime2 = prime(i+2);
                if (prime2) {
                    System.out.print("(" + i + "," + (i+2) + "),");
                }
            }
            else{
                
            }
        }
    }
    public static boolean prime(int num){
        if (num == 2) {
            return true;
        }
        else{
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
           return true;
        }   
    }
}