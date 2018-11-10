/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_fore;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LotteryUsingStrings {
    public static void main(String[] args) {
        String lottery = "" + (int)(Math.random() * 10) 
                + (int)(Math.random() * 10);
        
        Scanner input = new Scanner(System.in);
        System.out.print("enter your lottery pick (two digits) : ");
        String guess = input.nextLine();
        
        char lotteryDigite1 = lottery.charAt(0);
        char lotteryDigite2 = lottery.charAt(1);
        
        char guessDigite1 = guess.charAt(0);
        char guessDigite2 = guess.charAt(1);
        
        System.out.println("the lottery number is : " + lottery);
        
        
        if(guess.equals(lottery))
            System.out.println("exact match : you win $10000");
        else if (guessDigite2 == lotteryDigite1
                && guessDigite1 == lotteryDigite2 )
            System.out.println("match all digits : you win $3000");
        else  if  (guessDigite1 == lotteryDigite1
                  || guessDigite2 == lotteryDigite2 
                  || guessDigite1 == lotteryDigite2
                  || guessDigite2 == lotteryDigite1)
            System.out.println("match one digits : you win $1000");
        else
            System.out.println("sorry, no match"); 
    }
            
}
