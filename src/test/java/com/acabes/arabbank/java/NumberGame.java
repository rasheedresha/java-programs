package com.acabes.arabbank.java;

import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main (String[] args)
    {
        int wrongcount=0;
        Scanner s=new Scanner(System.in);
        Random randomNumber=new Random();
        int rightGuess=randomNumber.nextInt(101);
        System.out.println("Enter your guess (number between 1 and 100) :");
        do{
            int guess=s.nextInt();
            wrongcount++;

            if(guess<rightGuess)
            {
                System.out.println("Guess is low, try again");
            }
            else if(guess>rightGuess)
            {
                System.out.println("Guess is high, try again");
            }
            else{
                System.out.println("Congratulations! You have guessed the number right!");
                break;
            }
        } while(true);

        System.out.println("Number of wrong guesses: "+wrongcount);


    }

}

