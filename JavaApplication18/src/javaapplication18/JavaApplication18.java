/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author matin
 */

public class JavaApplication18 {
    public static double rad, height;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c = new Circle();
        
        Cylinder cy = new Cylinder();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the radius");
        rad = sc.nextDouble();
        
        System.out.println("Enter the height");
        height = sc.nextDouble();
        
        System.out.println("the circumference of circle with radius " + rad + " is " + c.circumference());
        System.out.println("the area of circle with radius " + rad + " is " + c.circumference());
        
        System.out.println("the cylinderparameter of cylinder with radius " + rad + " is " + cy.cylinderparameter());
        System.out.println("the area of cylinder with radius " + rad + " and height " + height + " is " + cy.area());
        
    }    
}
class Circle{
    double circumference(){
        return 2*3.14*JavaApplication18.rad;
    }
    double area(){
        return JavaApplication18.rad*JavaApplication18.rad*3.14;
    }
}
class Cylinder{
    double cylinderparameter(){
        return 2*3.14*JavaApplication18.rad*JavaApplication18.height;
    }
    double area(){
        return 2*JavaApplication18.rad*JavaApplication18.rad*3.14 + (2*3.14*JavaApplication18.rad*JavaApplication18.height);
    }
}
