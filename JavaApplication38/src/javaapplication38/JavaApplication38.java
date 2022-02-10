/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38;

/**
 *
 * @author matin
 */
public class JavaApplication38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marks[][] = {
            {"name" , "MATHEMATIC" , "ENGLISH"},
            {"PARSA" , "85" , "95"},
            {"ROXANA", "69" , "71"},
            {"AKBAR" , "78", "85"}
        };
        String course= "mathematic";
        String name = "parsa";
        String mark = "85";
        int courseloc = 0;
        int nameloc= 0;
        int markloc=0;
        System.out.println("Here is the students mathematics marks");
        for (int i = 0; i < marks[0].length; i++) {
            if (marks[0][i].equals(course.toUpperCase())) {
                courseloc = i;
            }
        }
        for (int i = 1; i < marks.length; i++) {
            System.out.println("The student " + marks[i][0] + " got " + marks[i][courseloc]);
        }
        System.out.println("");
        System.out.println("Here is the students who got 85");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                if (marks[i][j].equals(mark)) {
                    nameloc = i;
                    markloc = j;
                    System.out.println("The student " + marks[nameloc][0] + " got " + marks[nameloc][markloc] + " in the course " + marks[0][markloc]);
                }
            }
        }
        System.out.println("");
        System.out.println("Here is the result of the student " + name);
        for (int i = 0; i < marks.length; i++) {
            if (marks[i][0].equals(name.toUpperCase())) {
                nameloc = i;
            }
        }
        for (int j = 1; j < marks[nameloc].length; j++) {
            markloc = j;
            System.out.println("The student " + marks[nameloc][0] + " got " + marks[nameloc][markloc] + " in the course " + marks[0][markloc]);
        }
    }
    
}
