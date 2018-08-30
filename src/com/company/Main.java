package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static String guess;
    private static String word;
    private static int wordLength;
    private static int numCorrect;


        public static void main(String[] args) {
            word = "animal";
            wordLength = word.length();
            for (int i = 0; i < 4; i++) {
                guess = scan.next();
                guess = guess.trim();
                numCorrect = checkGuess(word, guess);
                System.out.println(numCorrect + "/" + wordLength);
                if (numCorrect == wordLength)
                    break;
            }


        }

    private static int checkGuess(String word, String guess) {
        char[] wordC = word.toLowerCase().toCharArray();
        char[] guessC = guess.toLowerCase().toCharArray();
        int correct = 0;

            if (wordC.length >= guessC.length) {
                for (int i = 0; i < guessC.length; i++) {
                    if (wordC[i] == guessC[i])
                        correct++;
                }
                return correct;
            } else {
                for (int i = 0; i < wordC.length; i++) {
                    if (wordC[i] == guessC[i])
                        numCorrect++;
                }
                return correct;
            }


        }
}
