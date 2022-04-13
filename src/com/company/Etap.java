package com.company;

import java.util.Random;
import java.util.Scanner;

public class Etap {
    public void et() {
        Random random = new Random();
        int computerchoice1 = random.nextInt(2, 13);
        int computerchoice2 = random.nextInt(2, 13);
        int computerchoice3 = random.nextInt(2, 13);

        Scanner scanner = new Scanner(System.in);
        System.out.println("---             Start game            ---\n");
        System.out.println("Do you want to cheating? y/n");
        String cheating = scanner.nextLine();

        Kubik usersKubik = new Kubik(random());
        Kubik usersKubik1 = new Kubik(random());
        Kubik usersKubik2 = new Kubik(random());

        Kubik computersKubik = new Kubik(random());
        Kubik computersKubik1 = new Kubik(random());
        Kubik computersKubik2 = new Kubik(random());

        int predicted1 = usersKubik.printDice();
        int user1 = mathOperation(predicted1, kubik1(), kubik2());
        if (cheating.equals("y") || cheating.equals("Y")) {

            if (predicted1 == 2 || predicted1 == 3 || predicted1 == 4 || predicted1 == 5
                    || predicted1 == 6 || predicted1 == 7) {
                int dice1 = kubik1() + kubik2();//predicted1 dice1 user1
                System.out.println("On the dice fell " + dice1 + " points.");
                usersKubik.rollTheDice(kubik1());
                usersKubik.rollTheDice(kubik2());

                int compDice1 = kubik1() + kubik2();//comp1 compdice computer1
                System.out.println("\nComputer predicted " + computerchoice1 + " points.");
                computersKubik.rollTheDice(kubik1());
                computersKubik.rollTheDice(kubik2());
                int computer1 = mathOperation(computerchoice1, kubik1(), kubik2());

                System.out.println("Do you want to cheating? y/n");
                cheating = scanner.nextLine();

                int predicted2 = usersKubik.printDice();
                int user2 = mathOperation(predicted2, kubik1(), kubik2());
                if (cheating.equals("y") || cheating.equals("Y")) {

                    if (predicted2 == 2 || predicted2 == 3 || predicted2 == 4) {
                        int dice2 = kubik1() + kubik2();//predicted2 dice2 user2
                        System.out.println("On the dice fell " + dice2 + " points.");
                        usersKubik1.rollTheDice(kubik1());
                        usersKubik1.rollTheDice(kubik2());

                        int compDice2 = kubik1() + kubik2();//comp2 compdice2 computer2
                        System.out.println("\nComputer predicted " + computerchoice2 + " points.");
                        computersKubik1.rollTheDice(kubik1());
                        computersKubik1.rollTheDice(kubik2());
                        int computer2 = mathOperation(computerchoice2, kubik1(), kubik2());

                        System.out.println("Do you want to cheating? y/n");
                        cheating = scanner.nextLine();

                        int predicted3 = usersKubik.printDice();
                        int user3 = mathOperation(predicted3, kubik1(), kubik2());
                        if (cheating.equals("y") || cheating.equals("Y")) {

                            if (predicted3 == 2 || predicted3 == 3) {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());
                                user3 = user3 - 10;

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        } else {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice3 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());

                            if (computerchoice3 == 2 || computerchoice3 == 3) {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                compDice3 = computer3 - 10;
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        }
                    } else {
                        int dice2 = kubik1() + kubik2();//predicted2 dice2 user2
                        System.out.println("On the dice fell " + dice2 + " points.");
                        usersKubik1.rollTheDice(kubik1());
                        usersKubik1.rollTheDice(kubik2());
                        user2 = user2 - 10;

                        int compDice2 = kubik1() + kubik2();//comp2 compdice2 computer2
                        System.out.println("\nComputer predicted " + computerchoice2 + " points.");
                        computersKubik1.rollTheDice(kubik1());
                        computersKubik1.rollTheDice(kubik2());
                       int computer2 = mathOperation(computerchoice2, kubik1(), kubik2());

                        System.out.println("Do you want to cheating? y/n");
                        cheating = scanner.nextLine();
                        int predicted3 = usersKubik.printDice();
                        int user3 = mathOperation(predicted3, kubik1(), kubik2());
                        if (cheating.equals("y") || cheating.equals("Y")) {

                            if (predicted3 == 2 || predicted3 == 3) {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());
                                user3 = user3 - 10;

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        } else {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice3 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());

                            if (computerchoice3 == 2 || computerchoice3 == 3) {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                compDice3 = computer3 - 10;
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        }
                    }
                } else {
                    int dice2 = kubik1() + kubik2();//predicted2 dice2 user2
                    System.out.println("On the dice fell " + dice2 + " points.");
                    usersKubik1.rollTheDice(kubik1());
                    usersKubik1.rollTheDice(kubik2());

                    if (computerchoice2 == 2 || computerchoice2 == 3 || computerchoice2 == 4) {
                        int compDice2 = kubik1() + kubik2();//comp2 compdice2 computer2
                        System.out.println("\nComputer predicted " + computerchoice2 + " points.");
                        computersKubik1.rollTheDice(kubik1());
                        computersKubik1.rollTheDice(kubik2());
                        int computer2 = mathOperation(computerchoice2, kubik1(), kubik2());

                        System.out.println("Do you want to cheating? y/n");
                        cheating = scanner.nextLine();
                        int predicted3 = usersKubik.printDice();
                        int user3 = mathOperation(predicted3, kubik1(), kubik2());
                        if (cheating.equals("y") || cheating.equals("Y")) {

                            if (predicted3 == 2 || predicted3 == 3) {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice1 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());
                                user3 = user3 - 10;

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        } else {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice1 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());

                            if (computerchoice3 == 2 || computerchoice3 == 3) {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                compDice3 = computer3 - 10;
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        }
                    } else {
                        int compDice2 = kubik1() + kubik2();//comp2 compdice2 computer2
                        System.out.println("\nComputer predicted " + computerchoice2 + " points.");
                        computersKubik1.rollTheDice(kubik1());
                        computersKubik1.rollTheDice(kubik2());
                        int computer2 = mathOperation(computerchoice2, kubik1(), kubik2());
                        computer2 = compDice2 - 10;

                        System.out.println("Do you want to cheating? y/n");
                        cheating = scanner.nextLine();
                        int predicted3 = usersKubik.printDice();
                        int user3 = mathOperation(predicted3, kubik1(), kubik2());
                        if (cheating.equals("y") || cheating.equals("Y")) {

                            if (predicted3 == 2 || predicted3 == 3) {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());
                                user3 = user3 - 10;

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        } else {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice3 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());

                            if (computerchoice3 == 2 || computerchoice3 == 3) {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                compDice3 = computer3 - 10;
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        }
                    }
                }
            } else {
                int dice1 = kubik1() + kubik2();//predicted1 dice1 user1
                System.out.println("On the dice fell " + dice1 + " points.");
                usersKubik.rollTheDice(kubik1());
                usersKubik.rollTheDice(kubik2());
                user1 = user1 - 10;

                int compDice1 = kubik1() + kubik2();//comp1 compdice computer1
                System.out.println("\nComputer predicted " + computerchoice1 + " points.");
                computersKubik.rollTheDice(kubik1());
                computersKubik.rollTheDice(kubik2());
                int computer1 = mathOperation(computerchoice1, kubik1(), kubik2());

                System.out.println("Do you want to cheating? y/n");
                cheating = scanner.nextLine();

                int predicted2 = usersKubik.printDice();
                int user2 = mathOperation(predicted2, kubik1(), kubik2());
                if (cheating.equals("y") || cheating.equals("Y")) {

                    if (predicted2 == 2 || predicted2 == 3 || predicted2 == 4) {
                        int dice2 = kubik1() + kubik2();//predicted2 dice2 user2
                        System.out.println("On the dice fell " + dice2 + " points.");
                        usersKubik1.rollTheDice(kubik1());
                        usersKubik1.rollTheDice(kubik2());

                        int compDice2 = kubik1() + kubik2();//comp2 compdice2 computer2
                        System.out.println("\nComputer predicted " + computerchoice2 + " points.");
                        computersKubik1.rollTheDice(kubik1());
                        computersKubik1.rollTheDice(kubik2());
                        int computer2 = mathOperation(computerchoice2, kubik1(), kubik2());

                        System.out.println("Do you want to cheating? y/n");
                        cheating = scanner.nextLine();

                        int predicted3 = usersKubik.printDice();
                        int user3 = mathOperation(predicted3, kubik1(), kubik2());
                        if (cheating.equals("y") || cheating.equals("Y")) {

                            if (predicted3 == 2 || predicted3 == 3) {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());
                                user3 = user3 - 10;

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        } else {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice3 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());

                            if (computerchoice3 == 2 || computerchoice3 == 3) {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                compDice3 = computer3 - 10;
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        }
                    } else {
                        int dice2 = kubik1() + kubik2();//predicted2 dice2 user2
                        System.out.println("On the dice fell " + dice2 + " points.");
                        usersKubik1.rollTheDice(kubik1());
                        usersKubik1.rollTheDice(kubik2());
                        user2 = user2 - 10;

                        int compDice2 = kubik1() + kubik2();//comp2 compdice2 computer2
                        System.out.println("\nComputer predicted " + computerchoice2 + " points.");
                        computersKubik1.rollTheDice(kubik1());
                        computersKubik1.rollTheDice(kubik2());
                        int computer2 = mathOperation(computerchoice2, kubik1(), kubik2());

                        System.out.println("Do you want to cheating? y/n");
                        cheating = scanner.nextLine();
                        int predicted3 = usersKubik.printDice();
                        int user3 = mathOperation(predicted3, kubik1(), kubik2());
                        if (cheating.equals("y") || cheating.equals("Y")) {

                            if (predicted3 == 2 || predicted3 == 3) {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());
                                user3 = user3 - 10;

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        } else {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice3 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());

                            if (computerchoice3 == 2 || computerchoice3 == 3) {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                compDice3 = computer3 - 10;
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        }
                    }
                } else {
                    int dice2 = kubik1() + kubik2();//predicted2 dice2 user2
                    System.out.println("On the dice fell " + dice2 + " points.");
                    usersKubik1.rollTheDice(kubik1());
                    usersKubik1.rollTheDice(kubik2());

                    if (computerchoice2 == 2 || computerchoice2 == 3 || computerchoice2 == 4) {
                        int compDice2 = kubik1() + kubik2();//comp2 compdice2 computer2
                        System.out.println("\nComputer predicted " + computerchoice2 + " points.");
                        computersKubik1.rollTheDice(kubik1());
                        computersKubik1.rollTheDice(kubik2());
                        int computer2 = mathOperation(computerchoice2, kubik1(), kubik2());

                        System.out.println("Do you want to cheating? y/n");
                        cheating = scanner.nextLine();
                        int predicted3 = usersKubik.printDice();
                        int user3 = mathOperation(predicted3, kubik1(), kubik2());
                        if (cheating.equals("y") || cheating.equals("Y")) {

                            if (predicted3 == 2 || predicted3 == 3) {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());
                                user3 = user3 - 10;

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        } else {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice3 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());

                            if (computerchoice3 == 2 || computerchoice3 == 3) {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());

                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                compDice3 = computer3 - 10;
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        }
                    } else {
                        int compDice2 = kubik1() + kubik2();//comp2 compdice2 computer2
                        System.out.println("\nComputer predicted " + computerchoice2 + " points.");
                        int computer2 = mathOperation(computerchoice2, kubik1(), kubik2());
                        computer2 = compDice2 - 10;

                        System.out.println("Do you want to cheating? y/n");
                        cheating = scanner.nextLine();
                        int predicted3 = usersKubik.printDice();
                        int user3 = mathOperation(predicted3, kubik1(), kubik2());
                        if (cheating.equals("y") || cheating.equals("Y")) {

                            if (predicted3 == 2 || predicted3 == 3) {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                                System.out.println("On the dice fell " + dice3 + " points.");
                                usersKubik2.rollTheDice(kubik1());
                                usersKubik2.rollTheDice(kubik2());
                                user3 = user3 - 10;

                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        } else {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice3 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());

                            if (computerchoice3 == 2 || computerchoice3 == 3) {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            } else {
                                int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                                System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                                computersKubik2.rollTheDice(kubik1());
                                computersKubik2.rollTheDice(kubik2());
                                int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                                compDice3 = computer3 - 10;
                                finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                        compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                                int users = (user1 + user2 + user3);
                                int computers = (computer1 + computer2 + computer3);
                                winner(users, computers);
                            }
                        }
                    }
                }

            }

        } else {
            int dice1 = kubik1() + kubik2();//predicted1 dice1 user1
            System.out.println("On the dice fell " + dice1 + " points.");
            usersKubik.rollTheDice(kubik1());
            usersKubik.rollTheDice(kubik2());

            int compDice1 = kubik1() + kubik2();//comp1 compdice computer1
            System.out.println("\nComputer predicted " + computerchoice1 + " points.");
            computersKubik.rollTheDice(kubik1());
            computersKubik.rollTheDice(kubik2());
            int computer1 = mathOperation(computerchoice1, kubik1(), kubik2());

            System.out.println("Do you want to cheating? y/n");
            cheating = scanner.nextLine();

            int predicted2 = usersKubik.printDice();
            int user2 = mathOperation(predicted2, kubik1(), kubik2());
            if (cheating.equals("y") || cheating.equals("Y")) {

                if (predicted2 == 2 || predicted2 == 3 || predicted2 == 4) {
                    int dice2 = kubik1() + kubik2();//predicted2 dice2 user2
                    System.out.println("On the dice fell " + dice2 + " points.");
                    usersKubik1.rollTheDice(kubik1());
                    usersKubik1.rollTheDice(kubik2());

                    int compDice2 = kubik1() + kubik2();//comp2 compdice2 computer2
                    System.out.println("\nComputer predicted " + computerchoice2 + " points.");
                    computersKubik1.rollTheDice(kubik1());
                    computersKubik1.rollTheDice(kubik2());
                    int computer2 = mathOperation(computerchoice2, kubik1(), kubik2());

                    System.out.println("Do you want to cheating? y/n");
                    cheating = scanner.nextLine();

                    int predicted3 = usersKubik.printDice();
                    int user3 = mathOperation(predicted3, kubik1(), kubik2());
                    if (cheating.equals("y") || cheating.equals("Y")) {

                        if (predicted3 == 2 || predicted3 == 3) {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice3 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());

                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        } else {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice3 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());
                            user3 = user3 - 10;

                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        }
                    } else {
                        int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                        System.out.println("On the dice fell " + dice3 + " points.");
                        usersKubik2.rollTheDice(kubik1());
                        usersKubik2.rollTheDice(kubik2());

                        if (computerchoice3 == 2 || computerchoice3 == 3) {
                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        } else {
                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            compDice3 = computer3 - 10;
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        }
                    }
                } else {
                    int dice2 = kubik1() + kubik2();//predicted2 dice2 user2
                    System.out.println("On the dice fell " + dice2 + " points.");
                    usersKubik1.rollTheDice(kubik1());
                    usersKubik1.rollTheDice(kubik2());
                    user2 = user2 - 10;

                    int compDice2 = kubik1() + kubik2();//comp2 compdice2 computer2
                    System.out.println("\nComputer predicted " + computerchoice2 + " points.");
                    computersKubik1.rollTheDice(kubik1());
                    computersKubik1.rollTheDice(kubik2());
                    int computer2 = mathOperation(computerchoice2, kubik1(), kubik2());

                    System.out.println("Do you want to cheating? y/n");
                    cheating = scanner.nextLine();
                    int predicted3 = usersKubik.printDice();
                    int user3 = mathOperation(predicted3, kubik1(), kubik2());
                    if (cheating.equals("y") || cheating.equals("Y")) {

                        if (predicted3 == 2 || predicted3 == 3) {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice3 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());

                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        } else {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice2 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());
                            user3 = user3 - 10;

                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        }
                    } else {
                        int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                        System.out.println("On the dice fell " + dice3 + " points.");
                        usersKubik2.rollTheDice(kubik1());
                        usersKubik2.rollTheDice(kubik2());

                        if (computerchoice3 == 2 || computerchoice3 == 3) {
                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        } else {
                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            compDice3 = computer3 - 10;
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        }
                    }
                }
            } else {
                int dice2 = kubik1() + kubik2();//predicted2 dice2 user2
                System.out.println("On the dice fell " + dice2 + " points.");
                usersKubik1.rollTheDice(kubik1());
                usersKubik1.rollTheDice(kubik2());

                if (computerchoice2 == 2 || computerchoice2 == 3 || computerchoice2 == 4) {
                    int compDice2 = kubik1() + kubik2();//comp2 compdice2 computer2
                    System.out.println("\nComputer predicted " + computerchoice2 + " points.");
                    computersKubik1.rollTheDice(kubik1());
                    computersKubik1.rollTheDice(kubik2());
                    int computer2 = mathOperation(computerchoice2, kubik1(), kubik2());

                    System.out.println("Do you want to cheating? y/n");
                    cheating = scanner.nextLine();
                    int predicted3 = usersKubik.printDice();
                    int user3 = mathOperation(predicted3, kubik1(), kubik2());
                    if (cheating.equals("y") || cheating.equals("Y")) {

                        if (predicted3 == 2 || predicted3 == 3) {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice3 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());

                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        } else {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice3 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());
                            user3 = user3 - 10;

                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        }
                    } else {
                        int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                        System.out.println("On the dice fell " + dice3 + " points.");
                        usersKubik2.rollTheDice(kubik1());
                        usersKubik2.rollTheDice(kubik2());

                        if (computerchoice3 == 2 || computerchoice3 == 3) {
                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        } else {
                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            compDice3 = computer3 - 10;
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        }
                    }
                } else {
                    int compDice2 = kubik1() + kubik2();//comp2 compdice2 computer2
                    System.out.println("\nComputer predicted " + computerchoice2 + " points.");
                    computersKubik1.rollTheDice(kubik1());
                    computersKubik1.rollTheDice(kubik2());
                    int computer2 = mathOperation(computerchoice2, kubik1(), kubik2());
                    computer2 = compDice2 - 10;

                    System.out.println("Do you want to cheating? y/n");
                    cheating = scanner.nextLine();
                    int predicted3 = usersKubik.printDice();
                    int user3 = mathOperation(predicted3, kubik1(), kubik2());
                    if (cheating.equals("y") || cheating.equals("Y")) {

                        if (predicted3 == 2 || predicted3 == 3) {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice3 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());

                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        } else {
                            int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                            System.out.println("On the dice fell " + dice3 + " points.");
                            usersKubik2.rollTheDice(kubik1());
                            usersKubik2.rollTheDice(kubik2());
                            user3 = user3 - 10;

                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        }
                    } else {
                        int dice3 = kubik1() + kubik2();//predicted3 dice3 user3
                        System.out.println("On the dice fell " + dice3 + " points.");
                        usersKubik2.rollTheDice(kubik1());
                        usersKubik2.rollTheDice(kubik2());

                        if (computerchoice3 == 2 || computerchoice3 == 3) {
                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        } else {
                            int compDice3 = kubik1() + kubik2();//comp3 compdice3 computer3
                            System.out.println("\nComputer predicted " + computerchoice3 + " points.");
                            computersKubik2.rollTheDice(kubik1());
                            computersKubik2.rollTheDice(kubik2());
                            int computer3 = mathOperation(computerchoice3, kubik1(), kubik2());
                            compDice3 = computer3 - 10;
                            finish(predicted1, predicted2, predicted3, computerchoice1, computerchoice2, computerchoice3, dice1, dice2, dice3,
                                    compDice1, compDice2, compDice3, user1, user2, user3, computer1, computer2, computer3);
                            int users = (user1 + user2 + user3);
                            int computers = (computer1 + computer2 + computer3);
                            winner(users, computers);
                        }

                    }
                }
            }
        }
    }

    public int mathOperation(int diceNumber, int b, int c) {
        int point = (b + c) - Math.abs((b + c) - diceNumber) * 2;
        return point;
    }

    public int random() {
        Random random = new Random();
        int san = random.nextInt(1, 7);
        return san;
    }

    public int kubik1() {
        Kubik kubik = new Kubik(random());
        int a = kubik.getBir();
        return a;
    }

    public int kubik2() {
        Kubik kubik = new Kubik(random());
        int a = kubik.getBir();
        return a;
    }

    public void winner(int userPoint, int computerPoint) {
        System.out.println("\n");
        if (userPoint == computerPoint) {
            System.err.println("Draw!" + "\nUser's point is : " + userPoint +
                    "\nComputer's point is : " + computerPoint + "\nConguratulation!");
        } else if (userPoint > computerPoint) {
            System.err.println("Users win " + (userPoint - computerPoint)
                    + " points more!\nConguratulation!");
        } else {
            System.err.println("Computers win " + (computerPoint - userPoint)
                    + " points more!\nConguratulation!");
        }
    }

    public void finish(int predicted1, int predicted2, int predicted3, int computerchoice1, int computerchoice2, int computerchoice3,
                       int dice1, int dice2, int dice3, int compDice1, int compDice2, int compDice3, int user1, int user2, int user3,
                       int computer1, int computer2, int computer3) {
        System.out.println("-----------------------Finish Game-----------------------\n\n"
                + "  Round  |            User |         Computer\n"
                + "---------+-----------------+-----------------\n"
                + "         |  Predicted :  " + predicted1 + " |  Predicted :  " + computerchoice1
                + "\n -  1  - |  Dice :       " + dice1
                + " |  Dice :       " + compDice1
                + "\n         |  Result :     " + user1 + " |  Result :     " + computer1
                + "\n---------+-----------------+-----------------\n"
                + "         |  Predicted :  " + predicted2 + " |  Predicted :  " + computerchoice2
                + "\n -  2  - |  Dice :       " + dice2
                + " |  Dice :       " + compDice2
                + "\n         |  Result :     " + user2 + " |  Result :     " + computer2
                + "\n---------+-----------------+-----------------\n"
                + "         |  Predicted :  " + predicted3 + " |  Predicted :  " + computerchoice3
                + "\n -  3  - |  Dice :       " + dice3
                + " |  Dice :      " + compDice3
                + "\n         |  Result :     " + user3 + " |  Result :     " + computer3
                + "\n---------+-----------------+-----------------\n"
                + "  Total  |  Points :   " + (user1 + user2 + user3) + "  |  Points :      "
                + (computer1 + computer2 + computer3));
    }
}
