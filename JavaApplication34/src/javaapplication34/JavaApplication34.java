/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

/**
 *
 * @author matin
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fraction g= new fraction ();
        fraction h= new fraction ();
        g.num=23;
        g.den=45;
        h.num=46;
        h.den=90;
        System.out.println(fraction.compare(g, h));
       
      
    }
    
}
class fraction {
    int num;
    int den;
    public static   boolean compare( fraction f1, fraction f2 ){
        return f1.num/f1.den == f2.num/f2.den;
    }
}