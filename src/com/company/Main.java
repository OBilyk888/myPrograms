package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner keyboardInput = new Scanner(System.in);

            String secretLetter = "G";
            String guess = "";
            int guessCount = 0;
            int guessLimit = 3;
            boolean outOfGuesses = false;

            while (!guess.equals(secretLetter) && !outOfGuesses) {

                if (guessCount < guessLimit){
                    System.out.print("Enter a guess: ");
                    guess = keyboardInput.nextLine();

                    guess = guess.toLowerCase();
                    secretLetter = secretLetter.toLowerCase();

                    //guess.getBytes();

                    guessCount++;

                } else {

                    outOfGuesses = true;
                }
            }

            if (outOfGuesses) {
                System.out.println("You Lose! No more guesses");
            } else

            System.out.println("You Win! from " + guessCount + " attempts");

        }
}
