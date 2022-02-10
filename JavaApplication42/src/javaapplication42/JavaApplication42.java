/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;

import java.util.Scanner;

/**
 *
 * @author matin
 */
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int counter = 0;
        String[][] input = new String[x1][x2];
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < x2; j++) {
                input[i][j] = sc2.nextLine();
                if (input[i][j].equals("*")) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
    
}
