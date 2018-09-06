package com.company;

import java.util.Scanner;

public class Game {
    private Difficulty difficulty;
    private String[] wordBank;

    public Game(Difficulty difficulty) {
        this.difficulty = difficulty;
        this.setDifficulty();
    }

    // TODO: 9/6/18 Add Words to difficulties other than AVERAGE
    private void setDifficulty() {
        if (this.difficulty == Difficulty.VERY_EASY) {
            this.wordBank = new String[]{"Buzzword", "Particle", "Flapjack", "Cardioid", "Finnegan", "Japanese"};
        } else if (this.difficulty == Difficulty.EASY) {
            this.wordBank = new String[]{"Buzzword", "Particle", "Flapjack", "Cardioid", "Finnegan", "Japanese"};
        } else if (this.difficulty == Difficulty.AVERAGE) {
            this.wordBank = new String[]{"Buzzword", "Particle", "Flapjack", "Cardioid", "Finnegan", "Japanese"};
        } else if (this.difficulty == Difficulty.HARD) {
            this.wordBank = new String[]{"Buzzword", "Particle", "Flapjack", "Cardioid", "Finnegan", "Japanese"};
        } else if (this.difficulty == Difficulty.VERY_HARD) {
            this.wordBank = new String[]{"Buzzword", "Particle", "Flapjack", "Cardioid", "Finnegan", "Japanese"};
        }
    }

    public void runGame(Scanner scan) {
        int numCorrect;
        int tries;
        int wordLength;
        boolean solved;
        for (String s : wordBank) {
            tries = 0;
            solved = false;
            wordLength = s.length();
            System.out.println("New word length: " + wordLength);
            while (!solved && tries < 4) {
                numCorrect = checkGuess(s, scan.next().trim());
                System.out.println(numCorrect + "/" + wordLength);
                if (numCorrect == wordLength) {
                    System.out.println("Correct!");
                    solved = true;
                } else {
                    tries++;
                    System.out.println("Tries Remaining: " + (4 - tries));
                }
            }
        }
        System.out.println("GG");
    }

    private int checkGuess(String word, String guess) {
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
                    correct++;
            }
            return correct;
        }


    }
}
