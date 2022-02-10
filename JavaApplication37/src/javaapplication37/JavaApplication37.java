/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

/**
 *
 * @author matin
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        String A[] = {"ALI", "AHMAD", "PARSA", "MOSTAFA", "MAMAD"};
        String name = "parsa";
        boolean found = false;
        int loc = -1;
        for (int i = 0; i < A.length && !found ; i++) {
            if (A[i].equals(name.toUpperCase())) {
                loc = i;
                found = true;
            }
        }
        if (found) {
            System.out.println(name + " has been found in the list at location " + (loc+1));
        }
        else{
            System.out.println("Not found");
        }
    }
}
