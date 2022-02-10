/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

/**
 *
 * @author matin
 */
public class JavaApplication32 {
    int x;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      fraction f1 = new fraction();
      f1.num=2;
      f1.den=3;
      fraction f2 = new fraction();
      f2.num=5;
      f2.den=6;
      f1.sum(f1.num, f2.num, f1.den, f2.den);
    }
}
class fraction{
    int num;
    int den;
    void reciprical(){
        System.out.println(""); 
    }
    void sum(int num1,int num2,int num3 , int num4){
        int newnum = num1+num2;
        int newden = num3 + num4;
        System.out.println(newden + "/" + newnum);
    }
}