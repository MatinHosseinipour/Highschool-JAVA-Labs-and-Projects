/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author matin
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m1 = 0;
        int m2 = 0;
        int arrays[] = {45,18,29,69,788,89};
        for (int i = 0; i < arrays.length; i++) {
            if (m1 < arrays[i]) {
                m2 = m1;
                m1 = arrays[i];
            }
            else{
                if (m2 < arrays[i]) {
                    m2 = arrays[i];
                }
                else{
                    
                }
            }
        }
        System.out.println(m1);
        System.out.println(m2);
    }
    
}
