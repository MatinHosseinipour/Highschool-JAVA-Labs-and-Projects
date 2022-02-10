/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author matin
 */
public class JavaApplication31 {

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
        if (p1.equal(p2)) {
            System.out.println("they are same");
        }
        else {
            System.out.println("they are not same");
        }
    }
}
class person{
    String name;
    int grade, mark1,mark2,mark3;
    double average(){
        return (mark1+mark2+mark3)/3;
    }
    boolean equal(person pOther){
        if (this.mark2 == pOther.mark2) {
            return true;
        }
        else{
        return false;
        }
    }
}
