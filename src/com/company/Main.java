package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
                guess.trim();
                numCorrect = checkGuess(word, guess);
                System.out.println(numCorrect + "/" + wordLength);
                if (numCorrect == wordLength)
                    break;
            }


        }

        public static int checkGuess(String word, String guess) {
            char[] wordC = word.toCharArray();
            char[] guessC = guess.toCharArray();
            int numCorrect = 0;

            if (wordC.length >= guessC.length) {
                for (int i = 0; i < guessC.length; i++) {
                    if (wordC[i].toLowerCase().equals(guessC.[i].toLowerCase()))
                    numCorrect++;
                }
                return numCorrect;
            } else {
                for (int i = 0; i < wordC.length; i++) {
                    if (wordC[i].toLowerCase().equals(guessC[i].toLowerCase()))
                        numCorrect++;
                }
                return numCorrect;
            }


        }
}
