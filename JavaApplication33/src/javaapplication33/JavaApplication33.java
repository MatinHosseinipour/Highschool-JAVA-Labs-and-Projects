/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

/**
 *
 * @author matin
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        f1.num = 5;
        f1.den = 9;
        f2.num = 5;
        f2.den = 8;
        System.out.println("division of " + f1.num +  "/" + f1.den + " and " + f2.num + "/" + f2.den + " equals to");
        f2.reciprocal();
        Fraction f3 = f1.product(f1, f2);
        System.out.println(f3.num + "/" + f3.den);
    }
    
}

class Fraction{
    int num,den,temp;
    Fraction product(Fraction f1,Fraction f2){
        Fraction result = new Fraction();
        result.num = f1.num * f2.num;
        result.den = f1.den * f2.den;
        return result;
    }
    void reciprocal(){
        temp = num;
        num = den;
        den = temp;
    }
}