package com.company;

import java.util.Scanner;

public class Main {
    // TODO: 9/6/18 Get difficulty from scanner
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int difficulty = 0;
        while (difficulty < 1 || difficulty > 5) {
            System.out.println("Set Difficulty 1-5");
            difficulty = scan.nextInt();
        }
        Game game = new Game(difficulty);
        game.runGame(scan);

    }


}
