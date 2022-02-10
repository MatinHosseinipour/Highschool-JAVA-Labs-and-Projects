/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

/**
 *
 * @author matin
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String A[] = {"ALI", "AHMAD", "PARSA", "MOSTAFA", "MAMAD"};
        String name = "parsa";
        if (search(name.toUpperCase(),A) != -1) {
            System.out.println(name + " has been found in the list at location " + (search(name.toUpperCase(),A)+1));
        }
        else{
            System.out.println("Not found");
        }
    }
    public static int search(String name, String[] A){
        int loc = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i].equals(name)) {
                loc = i;
            }
        }
        return loc;
    }
    
}
