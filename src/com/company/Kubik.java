package com.company;

import java.util.Scanner;

public class Kubik {

    private int bir;

    public Kubik(int bir) {
        this.bir = bir;
    }

    public int getBir() {
        return bir;
    }

    public void setBir(int bir) {
        this.bir = bir;
    }

    public int printDice(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Predict amount of points (2..12) :");
        int diceNumber = scanner.nextInt();
        System.out.println("\nUser rolls the dices...");

        while (true) {
            if (diceNumber < 2 || diceNumber > 12) {
                try {
                    throw new ArithmeticException();
                } catch (ArithmeticException d) {
                    System.err.println("Wrong number!\n");
                    System.out.print("Predict amount of points (2..12) :");
                    diceNumber = scanner.nextInt();
                }
            }  else break;
        }
        return diceNumber;
    }

    public void rollTheDice(int bir) {
        switch (bir) {
            case 1: {
                System.out.println("+---------+" + "\n" +
                        "|         |" + "\n" +
                        "|    #    |" + "\n" +
                        "|         |" + "\n" +
                        "+---------+");
                break;
            }
            case 2: {
                System.out.println("+---------+" + "\n" +
                        "|         |" + "\n" +
                        "| #     # |" + "\n" +
                        "|         |" + "\n" +
                        "+---------+");
                break;
            }
            case 3: {
                System.out.println("+---------+" + "\n" +
                        "|    #    |" + "\n" +
                        "|    #    |" + "\n" +
                        "|    #    |" + "\n" +
                        "+---------+");
                break;
            }
            case 4: {
                System.out.println("+--------+" + "\n" +
                        "| #    # |" + "\n" +
                        "|        |" + "\n" +
                        "| #    # |" + "\n" +
                        "+--------+");
                break;
            }
            case 5: {
                System.out.println("+---------+" + "\n" +
                        "| #     # |" + "\n" +
                        "|    #    |" + "\n" +
                        "| #     # |" + "\n" +
                        "+---------+");
                break;
            }
            case 6: {
                System.out.println("+---------+" + "\n" +
                        "| #     # |" + "\n" +
                        "| #     # |" + "\n" +
                        "| #     # |" + "\n" +
                        "+---------+");
                break;
            }
        }
    }
}
