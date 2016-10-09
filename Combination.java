/**
 * Name: Bryce Sulin (sulin)
 * Course: CSCI 241 - Computer Science I
 * Section: 001
 * Assignment: 4
 * 
 * Project/Class Description:
 * This program will ask the user to input a 6-digit number for the lottery drawing.
 * The system will randomly generate the correct 6-digit number to win the lottery.
 * 
 * Known bugs: none
 */

import java.util.Scanner;

public class Combination{
    public static void main(String[] args)
    {
        // Set up a scanner for input from keyboard
        Scanner input = new Scanner(System.in);

        // Generate a lottery number
        int lottery = (int)(Math.random() * 1000000);

        // Prompt the user to enter a guess
        int guess;
        System.out.print("Enter your combination guess (six digits) : ");
        guess = input.nextInt();

        // Get lottery digits (as pairs) from lottery!!!
        int lotteryDigitSet3 = (lottery % 100);
        int lotteryDigitSet2 = (lottery / 100) % 100; 
        int lotteryDigitSet1 = (lottery / 10000);

        // Get guess digits (as pairs) from guess!!!
        int guessDigitSet3 = (guess % 100);
        int guessDigitSet2 = (guess / 100) % 100; 
        int guessDigitSet1 = (guess / 10000);

        // Separate the combination number into 3 separate "pairs" of digits
        System.out.print("combination numbers are: ");
        if (lotteryDigitSet1 >= 10) {
            System.out.print(lotteryDigitSet1 + "-");
        }
        else {
            System.out.print("0" + lotteryDigitSet1 + "-");
        }
        if (lotteryDigitSet2 >= 10) {
            System.out.print(lotteryDigitSet2 + "-");
        }
        else {
            System.out.print("0" + lotteryDigitSet2 + "-");
        }
        if (lotteryDigitSet3 >= 10) {
            System.out.print(lotteryDigitSet3);
        }
        else {
            System.out.print("0" + lotteryDigitSet3);
        }
        System.out.println();

        /** Write If-else statements to check for 3 or 2 duplicate number sets
         *  and matching numbers.  (Lottery & Guess)
         */
        int matchDuplicate = 0;
        int matchAppear = 0;
        int exactMatch = 0;
        int matchCombo = 0;
        int flag = 0;

        if (guessDigitSet1 == guessDigitSet2 ||
        guessDigitSet1 == guessDigitSet3) 
        {
            matchDuplicate = 2;
        }
        if (guessDigitSet2 == guessDigitSet3) 
        {
            matchDuplicate = 2;
        }
        if (guessDigitSet1 == guessDigitSet2 &&
        guessDigitSet1 == guessDigitSet3 && guessDigitSet2 == guessDigitSet3) {
            matchDuplicate = 3;
        }

        if (guessDigitSet1 == lotteryDigitSet1) 
        {
            matchAppear = 1;
        }

        if (guessDigitSet2 == lotteryDigitSet2) 
        {
            matchAppear++;
        }
        if (guessDigitSet3 == lotteryDigitSet3) 
        {
            matchAppear++;
        }

            
        if (guessDigitSet1 == lotteryDigitSet1 &&
        guessDigitSet1 == lotteryDigitSet2 || guessDigitSet1 == lotteryDigitSet3) {
            matchAppear = 2;
        }
        if (guessDigitSet2 == lotteryDigitSet1 &&
        guessDigitSet2 == lotteryDigitSet2 || guessDigitSet2 == lotteryDigitSet3) {
            matchAppear = 2;
        }
        if (guessDigitSet3 == lotteryDigitSet1 &&
        guessDigitSet3 == lotteryDigitSet2 || guessDigitSet3 == lotteryDigitSet3) {
            matchAppear = 2;
        }  

        if (guessDigitSet1 == lotteryDigitSet2 &&
        guessDigitSet1 == lotteryDigitSet3 || guessDigitSet1 == lotteryDigitSet1) {
            matchAppear = 2;
        }
        if (guessDigitSet2 == lotteryDigitSet2 &&
        guessDigitSet2 == lotteryDigitSet3 || guessDigitSet2 == lotteryDigitSet1) {
            matchAppear = 2;
        }
        if (guessDigitSet3 == lotteryDigitSet2 &&
        guessDigitSet3 == lotteryDigitSet3 || guessDigitSet3 == lotteryDigitSet1) {
            matchAppear = 2;
        }

        if (guessDigitSet1 == lotteryDigitSet3 &&
        guessDigitSet1 == lotteryDigitSet1 || guessDigitSet1 == lotteryDigitSet2) {
            matchAppear = 2;
        }
        if (guessDigitSet2 == lotteryDigitSet3 &&
        guessDigitSet2 == lotteryDigitSet1 || guessDigitSet2 == lotteryDigitSet2) {
            matchAppear = 2;
        }
        if (guessDigitSet3 == lotteryDigitSet3 &&
        guessDigitSet3 == lotteryDigitSet1 || guessDigitSet3 == lotteryDigitSet2) {
            matchAppear = 2;
        }

        if (guessDigitSet1 == lotteryDigitSet1 &&
        guessDigitSet1 == lotteryDigitSet2 && guessDigitSet1 == lotteryDigitSet3) {
            matchAppear = 3;
        }
        if (guessDigitSet2 == lotteryDigitSet1 &&
        guessDigitSet2 == lotteryDigitSet2 && guessDigitSet2 == lotteryDigitSet3) {
            matchAppear = 3;
        }
        if (guessDigitSet3 == lotteryDigitSet1 &&
        guessDigitSet3 == lotteryDigitSet2 && guessDigitSet3 == lotteryDigitSet3) {
            matchAppear = 3;
        }

        // Write If-else statement for no matching numbers (Lottery & Guess)
        if (guessDigitSet1 != lotteryDigitSet1 &&
        guessDigitSet1 != lotteryDigitSet2 && guessDigitSet1 != lotteryDigitSet3) {
            matchAppear = 0;
        }
        if (guessDigitSet2 != lotteryDigitSet1 &&
        guessDigitSet2 != lotteryDigitSet2 && guessDigitSet2 != lotteryDigitSet3) {
            matchAppear = 0;
        }
        if (guessDigitSet3 != lotteryDigitSet1 &&
        guessDigitSet3 != lotteryDigitSet2 && guessDigitSet3 != lotteryDigitSet3) {
            matchAppear = 0;
        }

        /** Write If statement to check for exact match and correct number
         * but out of sequence. (Lottery & Guess)
         */
        if (lottery == guess) 
        {
            exactMatch = 1;
        }
        else 
        {
            if (guessDigitSet1 == lotteryDigitSet1)
            {
                matchCombo = 1;
            }
            if (guessDigitSet2 == lotteryDigitSet2)
            {
                matchCombo++;
            }
            if (guessDigitSet3 == lotteryDigitSet3)
            {
                matchCombo++;
            }
        }
        if (lottery == guess) 
        {
            exactMatch = 1;
        }
        else 
        {
            if (guessDigitSet1 == lotteryDigitSet1 ||
            guessDigitSet1 == lotteryDigitSet2 || guessDigitSet1 == lotteryDigitSet3) {
                matchAppear = 1;
            }
            if (guessDigitSet2 == lotteryDigitSet1 ||
            guessDigitSet2 == lotteryDigitSet2 || guessDigitSet2 == lotteryDigitSet3) {
                matchAppear++;
            }
            if (guessDigitSet3 == lotteryDigitSet1 ||
            guessDigitSet3 == lotteryDigitSet2 || guessDigitSet3 == lotteryDigitSet3) {
                matchAppear++;
            } 
        }

        /** Set if-else print statements for exactMatch, matchCombo, 
         *  and matchDuplicate variables
         */
        if (exactMatch == 0 &&
        matchAppear == 3 && matchCombo < 1) 
        {
            System.out.println("All numbers match but are out of sequence.");
            flag = 1;
        } 
        if (exactMatch == 1)
        {
            System.out.println("Exact match: Lock is open!");
        }
        if (matchDuplicate == 2) 
        {
            System.out.println("2 numbers in guess are duplicates of each other."); 
        } 
        if (matchDuplicate == 3) 
        {
            System.out.println("Guess contains 3 duplicate numbers."); 
        } 
        if (matchAppear >= 1 && matchCombo == 0 &&
        exactMatch != 1 && matchAppear < 3) 
        {
            System.out.println("One number in the guess appears in the combination."); 
        } 
        if (matchAppear >= 1 && matchCombo == 1 &&
        exactMatch != 1 && matchAppear == 3 && flag != 1) 
        {
            System.out.println("One number in the guess appears in the combination."); 
        }
        if (matchCombo == 2) 
        {
            System.out.println("2 numbers guessed appear in the combination."); 
        } 
        if (matchAppear == 0) 
        {
            System.out.println("Sorry, no match. Not your locker!");  
        }  
        System.out.println("-----------------------------------------------");

    }
}
