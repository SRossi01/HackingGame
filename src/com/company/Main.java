package com.company;

import java.util.Scanner;

public class Main {
    // TODO: 9/6/18 Get difficulty from scanner
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Set Difficulty 1-5");
        Game game = new Game(Difficulty.AVERAGE);
        game.runGame(scan);

    }


}
