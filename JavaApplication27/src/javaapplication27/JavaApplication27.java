/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.util.Scanner;

/**
 *
 * @author matin
 */
public class JavaApplication27 {
    public static double width,length, height;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box box = new Box();
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the width");
        width = sc.nextDouble();
        
        System.out.println("Enter the length");
        length = sc.nextDouble();
        
        System.out.println("Enter the height");
        height = sc.nextDouble();
        
        System.out.println("the volume of the box with width " + width + ", length " + length + " and height " + height);
        System.out.println("Is " + box.volume());
        
        System.out.println("the surface-area of the box with width " + width + ", length " + length + " and height " + height);
        System.out.println("Is " + box.area());
        
    } 
    
}
class Box{
    double volume(){
        return JavaApplication27.width * JavaApplication27.length * JavaApplication27.height;
    }
    double area(){
        return (JavaApplication27.width * JavaApplication27.length * 2) + (JavaApplication27.length * JavaApplication27.height * 2) + (JavaApplication27.width * JavaApplication27.height * 2);
    }
}