package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Game game = new Game();
        char choice;
        Etap etap = new Etap();

        do {
            etap.et();
//            game.gameDice();
            System.out.print("Do you want to play one more time y/n? :  \n");
            choice = scanner.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');

    }
}