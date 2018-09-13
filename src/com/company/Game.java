package com.company;

import java.util.Scanner;

public class Game {
    private int difficulty;
    private String[] wordBank;

    public Game(int difficulty) {
        this.difficulty = difficulty;
        this.setDifficulty();
    }

    private void setDifficulty() {
        if (this.difficulty == 1) {
            this.wordBank = new String[]{"Cart", "Power", "Green", "Fresh", "Part", "Next"};
        } else if (this.difficulty == 2) {
            this.wordBank = new String[]{"Yellow", "Article", "Pancake", "Phrase", "Water", "British"};
        } else if (this.difficulty == 3) {
            this.wordBank = new String[]{"Buzzword", "Particle", "Flapjack", "Cardioid", "Finnegan", "Japanese"};
        } else if (this.difficulty == 4) {
            this.wordBank = new String[]{"Radiation", "Taxonomy", "Accelerate", "Disinflation", "Gregorian", "Synesthesia"};
        } else if (this.difficulty == 5) {
            this.wordBank = new String[]{"Providence", "Manifestation", "Cartwheel", "Disinfectant", "Disambiguation", "Battleship"};
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
        // Avoid passing index bounds if words are diff lengths
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
