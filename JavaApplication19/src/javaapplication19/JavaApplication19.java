/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author matin
 */
public class JavaApplication19{  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account user1_acc = new Account();
        Account user2_acc = new Account();
        Account avg = new Account();
        user1_acc.deposit(500); 
        user2_acc.deposit(500);
        
        System.out.println("User one's balance is : " + user1_acc.showbalance());
        System.out.println("User two's balance is : " + user2_acc.showbalance());
        
        user1_acc.deposit(350);
        user2_acc.withdraw(235);
        
        System.out.println("User one's balance is : " + user1_acc.showbalance());
        System.out.println("User two's balance is : " + user2_acc.showbalance());
        
        
        System.out.println("Average of user one's and user two's balance is :" + avg.avg_accs(user1_acc.showbalance(), user2_acc.showbalance()));
    } 
}
class Account{
    double balance = 0;
    public void deposit(double dep){
        balance+=dep;
    }
    public void withdraw(double with){
        balance-=with;
    }
    public double showbalance(){
        return balance;
    }
    public double avg_accs(double user1_balance , double user2_balance){
        return (user1_balance + user2_balance)/2;
    }
}
