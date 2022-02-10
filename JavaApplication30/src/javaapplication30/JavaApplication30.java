/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author matin
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        person p1 = new person();
        p1.name = "Martin";
        p1.grade = 12;
        p1.mark1 = 88;
        p1.mark2 = 92;
        p1.mark3 = 87;
        person p2 = new person();
        p2.name = "Shahla";
        p2.grade = 12;
        p2.mark1 = 95;
        p2.mark2 = 99;
        p2.mark3 = 97;
        System.out.println(p1.name + " is grade " + p1.grade + " with the average of " + p1.average());
        System.out.println(p2.name + " is grade " + p2.grade + " with the average of " +    p2.average());
    }
}
class person{
    String name;
    int grade, mark1,mark2,mark3;
    double average(){
        return (mark1+mark2+mark3)/3;
    }
}