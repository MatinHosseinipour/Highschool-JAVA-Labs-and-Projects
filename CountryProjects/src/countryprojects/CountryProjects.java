/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countryprojects;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Matin Hosseini
 */
public class CountryProjects {
    static int rNum = 0;
    static int difficulty = 0;
    static int diff_set;
    static int howManyQuestions;
    static boolean rightdif = true;
    static int countryNumber = 0;
    static int questionNumber = 0;
    static String answerString = "";
    static String countryName = "";
    static int score = 0;
    static int numOfFaults = 0;
    static int correctAnswers = 0;
    static int wrongAnswers = 0;
    static String seeTheAnswer = "NO";
    static String answers [][] = {
        {"China","BEIJING","ASIA","23"},
        {"Egypt","CAIRO","AFRICA","27"},
        {"Canada","OTTAWA","NORTH AMERICA","10"},
        {"Brazil","BRAZILIA","SOUTH AMERICA","26"},
        {"United Arab Emirates","ABU DHABI","ASIA","7"},
        {"France","PARIS","EUROPE","18"},
        {"Australia","CANBERRA","OCEANIA","6"},
        {"Iran","TEHRAN","ASIA","31"},
        {"United States Of America","WASHINGTON","NORTH AMERICA","50"},
        {"Argentina","BUENOS AIRES","SOUTH AMERICA","23"}
    };
    static String trryAgain = "YES";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our game");
        while(trryAgain.equals("YES")){
            System.out.println("Enter the number of level you want to play\n\t 1)Hard \t 2)Normal \t 3)Easy");
            while(rightdif){
               difficulty = sc.nextInt();
                if (difficulty == 1 || difficulty == 2 || difficulty == 3) {
                    difficultyManager(difficulty);
                    rightdif = false;
                }
                else{
                    System.out.println("Enter again 'Wrong Number'");
                }
            }
            howManyQuestions = diff_set;
            while(diff_set > 0){
                System.out.println("---------- Question Number " + (howManyQuestions - diff_set + 1) + " ----------");
                randomNum(10,1);
                countries(rNum);
                randomNum(3, 1);
                questions(rNum);
                answers(); 
                diff_set--;
            }
            finishGame();
        }
    }
    
    public static void difficultyManager(int difficulty){
        switch(difficulty){
            case 1:
                System.out.println("You've Choosed Hard Difficulty");
                System.out.println("We're going to ask you 8 questions\n");
                diff_set = 8;
            break;
            case 2:
                System.out.println("You've Choosed Normal Difficulty");
                System.out.println("We're going to ask you 5 questions\n");
                diff_set = 5;
            break;
            case 3:
                System.out.println("You've Choosed Easy Difficulty");
                System.out.println("We're going to ask you 2 questions\n");
                diff_set = 2;
            break;
        }
    }
    public static void randomNum(int max, int min){
        Random rand = new Random();
       rNum = (int) (rand.nextInt((max - min) + 1) + min);
    }
    public static void countries(int num){
        switch (num) {
            case 1:
                countryNumber = 1;
                countryName= "China";
            break;
            case 2:
                countryNumber = 2;
                countryName= "Egypt";
            break;
            case 3:
                countryNumber = 3;
                countryName= "Canada";
            break;
            case 4:
                countryNumber = 4;
                countryName= "Brazil";
            break;
            case 5:
                countryNumber = 5;
                countryName= "United Arab Emirates";
            break;
            case 6:
                countryNumber = 6;
                countryName= "France";
            break;
            case 7:
                countryNumber = 7;
                countryName= "Australia";
            break;
            case 8:
                countryNumber = 8;
                countryName= "Iran";
            break;
            case 9:
                countryNumber = 9;
                countryName= "United States Of America";
            break;
            case 10:
                countryNumber = 10;
                countryName= "Argentina";
            break;
        }
    }
    public static void questions(int num){
        Scanner sc1 = new Scanner(System.in);
        switch(num){
            case 1:
                System.out.println("Where's the capital of " + countryName + "?");
                answerString = sc1.nextLine();
                answerString = answerString.toUpperCase();
                questionNumber = 1;
                break;
            case 2 :
                System.out.println("In which continent does " + countryName + " placed?");
                answerString = sc1.nextLine();
                answerString = answerString.toUpperCase();
                questionNumber = 2;
                break;
            case 3 :
                System.out.println("How many provinces does " + countryName + " have?");
                answerString = sc1.nextLine();
                answerString = answerString.toUpperCase();
                questionNumber = 3;
                break;
        }
    }
    public static void answers(){
        Scanner sc2 = new Scanner(System.in);
        if (answers[countryNumber-1][questionNumber].equals(answerString) ){
            System.out.print("Your answer was right SCORE+");
            score++;
            correctAnswers++;
            System.out.println("\t 'your score is " + score + "'\n");    
        }
        else {
            numOfFaults++;
            wrongAnswers++;
            System.out.println("Your answer was wrong " + numOfFaults + "/3\n");
            numberOfFaults();
            System.out.println("Do you want to see the correct answer ? Yes/No");
            seeTheAnswer = sc2.nextLine();
            seeTheAnswer = seeTheAnswer.toUpperCase();
            if(seeTheAnswer.equals("YES")){
                seeTheAnswer= "NO";
                rightAnswer();
            }
            else {
                System.out.println("OK! Going for next question \n");
            }
        }
    }
    public static void numberOfFaults(){
        if (numOfFaults == 3) {
            score--;
            System.out.print("You answered wrong three time SCORE-");
            System.out.println("\t 'your score is " + score + "'\n"); 
            numOfFaults = 0;
        }
        else{
            
        }
    }
    public static void finishGame(){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("\n\n \t\t This is the results time ;)");
        System.out.println("\nYou've answered \n\t" + correctAnswers + " question(s) correctly and \n\t"+ wrongAnswers + " question(s) wrongly.");
        if(correctAnswers > wrongAnswers){
            System.out.println("NICE! You're genius");
        }
        else if (correctAnswers == wrongAnswers){
            System.out.println("At least you did your best ;)");
        }
        else {
            System.out.println("You have to work on your general information!");
        }
        System.out.println("Do you want to play again? Yes/No \t 'REMEMBER your scores won't reset to zero!'");
        trryAgain = sc3.nextLine().toUpperCase();
        if(trryAgain.equals("YES")){
            System.out.println("\n\n\t\tOK! Let's Play AGAIN!!! \n");
            rightdif= true;
        }
        else{
            System.out.println("\n\t\t\tGOOD BYE!");
            trryAgain = "NO";
        }
    }
    public static void rightAnswer(){
        switch (questionNumber){
            case 1 :
                System.out.println("The capital of " + countryName + " is " + answers[countryNumber-1][1]);
                break;
            case 2 :
                System.out.println(countryName + " is placed in " + answers[countryNumber-1][2]);
                break;
            case 3 :
                System.out.println(countryName + " has " + answers[countryNumber-1][3] + " cities and regions");
                break;
        }
    }
}
