package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public void gameDice() {
        int counter1 = 1;
        int counter2 = 2;
        int counter3 = 3;

        System.out.println("---             Start game            ---\n");

        Kubik kubik1 = new Kubik(random());
        Kubik kubik2 = new Kubik(random());
        cheating();
        if (cheating() == "y") {
            int userDiceNumber = kubik1.printDice();
            if (userDiceNumber == 2 || userDiceNumber == 3 || userDiceNumber == 4
                    || userDiceNumber == 5 || userDiceNumber == 6) {
                int a1 = kubik1.getBir();
                int a2 = kubik2.getBir();
                kubik1.rollTheDice(a1);
                kubik2.rollTheDice(a2);

                int user = mathOperation(userDiceNumber, kubik1.getBir(), kubik2.getBir());


                System.out.println("On the dice fell " + (kubik1.getBir() + kubik2.getBir()) + " points.");
                System.out.println("Result is : " + (kubik1.getBir() + kubik2.getBir()) +
                        " - abs( " + (((kubik1.getBir() + kubik2.getBir()) + " - " +
                        userDiceNumber + " ) * 2 : ") + user + " points."));

                //2-etap
                Random random = new Random();
                int computeDdiceNumber1 = random.nextInt(2, 13);

                System.out.println("\nComputer predicted " + computeDdiceNumber1 + " points.");
                System.out.println("Computer rolls the dices...");

                Kubik kubik3 = new Kubik(random());
                kubik3.rollTheDice(kubik3.getBir());

                Kubik kubik4 = new Kubik(random());
                kubik4.rollTheDice(kubik4.getBir());

                int b1 = kubik3.getBir();
                int b2 = kubik4.getBir();
                int computer = mathOperation(computeDdiceNumber1, kubik3.getBir(), kubik4.getBir());
                System.out.println("On the dice fell " + (kubik3.getBir() + kubik4.getBir()) + " points.");
                System.out.println("Result is : " + (kubik3.getBir() + kubik4.getBir()) +
                        " - abs( " + (((kubik3.getBir() + kubik4.getBir()) + " - " +
                        computeDdiceNumber1 + " ) * 2 : ") + computer + " points."));
                winner(user, computer);

                // 3-etap
                int computeDdiceNumber2 = random.nextInt(2, 13);
                int computeDdiceNumber3 = random.nextInt(2, 13);
                int userDiceNumber2 = kubik1.getBir();
                int userDiceNumber3 = kubik2.getBir();

                int user1 = mathOperation(userDiceNumber2, kubik1.getBir(), kubik2.getBir());
                int user2 = mathOperation(userDiceNumber3, kubik1.getBir(), kubik2.getBir());
                int computer1 = mathOperation(computeDdiceNumber2, kubik3.getBir(), kubik4.getBir());
                int computer2 = mathOperation(computeDdiceNumber3, kubik3.getBir(), kubik4.getBir());

                int b = kubik1.printDice();
                int c = kubik1.printDice();
                kubik1.setBir(random());
                kubik2.setBir(random());

                int a3 = kubik1.getBir();
                int a4 = kubik2.getBir();
                kubik1.setBir(random());
                kubik2.setBir(random());

                int a5 = kubik1.getBir();
                int a6 = kubik2.getBir();
                kubik1.setBir(random());
                kubik2.setBir(random());

                int b3 = kubik3.getBir();
                int b4 = kubik4.getBir();
                kubik1.setBir(random());
                kubik2.setBir(random());

                int b5 = kubik3.getBir();
                int b6 = kubik4.getBir();

                System.out.println("-----------------------Finish Game-----------------------\n\n"
                        + "  Round  |            User |         Computer\n"
                        + "---------+-----------------+-----------------\n"
                        + "         |  Predicted :  " + userDiceNumber + " |  Predicted :  " + computeDdiceNumber1
                        + "\n -  1  - |  Dice :       " + (a1 + a2)
                        + " |  Dice :       " + (b1 + b2)
                        + "\n         |  Result :     " + user + " |  Result :     " + computer
                        + "\n---------+-----------------+-----------------\n"
                        + "         |  Predicted :  " + b + " |  Predicted :  " + computeDdiceNumber2
                        + "\n -  1  - |  Dice :       " + (a3 + a4)
                        + " |  Dice :       " + (b3 + b4)
                        + "\n         |  Result :     " + user1 + " |  Result :     " + computer1
                        + "\n---------+-----------------+-----------------\n"
                        + "         |  Predicted :  " + c + " |  Predicted :  " + computeDdiceNumber3
                        + "\n -  1  - |  Dice :       " + (a5 + a6)
                        + " |  Dice :      " + (b5 + b6)
                        + "\n         |  Result :     " + user2 + " |  Result :     " + computer2
                        + "\n---------+-----------------+-----------------\n"
                        + "  Total  |  Points :   " + (user1 + user2 + user) + "  |  Points :      "
                        + (computer + computer1 + computer2));
                int winner3Etap = (user1 + user2 + user);
                int winner3Etap1 = (computer + computer1 + computer2);

                winner(winner3Etap, winner3Etap1);


            } else {
                int user = mathOperation(userDiceNumber, kubik1.getBir(), kubik2.getBir());
                user = user - 10;
            }
        } else {
            etap4();
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

    public String cheating() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to cheating? y/n?");
        String confirmation = scanner.nextLine();
        return confirmation;
    }
    public void etap4(){
        Kubik kubik1 = new Kubik(random());
        Kubik kubik2 = new Kubik(random());
        int userDiceNumber = kubik1.printDice();

        int a1 = kubik1.getBir();
        int a2 = kubik2.getBir();
        kubik1.rollTheDice(a1);
        kubik2.rollTheDice(a2);

        int user = mathOperation(userDiceNumber, kubik1.getBir(), kubik2.getBir());

        System.out.println("On the dice fell " + (kubik1.getBir() + kubik2.getBir()) + " points.");
        System.out.println("Result is : " + (kubik1.getBir() + kubik2.getBir()) +
                " - abs( " + (((kubik1.getBir() + kubik2.getBir()) + " - " +
                userDiceNumber + " ) * 2 : ") + user + " points."));

        //2-etap
        Random random = new Random();
        int computeDdiceNumber1 = random.nextInt(2, 13);

        System.out.println("\nComputer predicted " + computeDdiceNumber1 + " points.");
        System.out.println("Computer rolls the dices...");

        Kubik kubik3 = new Kubik(random());
        kubik3.rollTheDice(kubik3.getBir());

        Kubik kubik4 = new Kubik(random());
        kubik4.rollTheDice(kubik4.getBir());

        int b1 = kubik3.getBir();
        int b2 = kubik4.getBir();
        int computer = mathOperation(computeDdiceNumber1, kubik3.getBir(), kubik4.getBir());
        System.out.println("On the dice fell " + (kubik3.getBir() + kubik4.getBir()) + " points.");
        System.out.println("Result is : " + (kubik3.getBir() + kubik4.getBir()) +
                " - abs( " + (((kubik3.getBir() + kubik4.getBir()) + " - " +
                computeDdiceNumber1 + " ) * 2 : ") + computer + " points."));
        winner(user, computer);

        // 3-etap
        int computeDdiceNumber2 = random.nextInt(2, 13);
        int computeDdiceNumber3 = random.nextInt(2, 13);
        int userDiceNumber2 = kubik1.getBir();
        int userDiceNumber3 = kubik2.getBir();

        int user1 = mathOperation(userDiceNumber2, kubik1.getBir(), kubik2.getBir());
        int user2 = mathOperation(userDiceNumber3, kubik1.getBir(), kubik2.getBir());
        int computer1 = mathOperation(computeDdiceNumber2, kubik3.getBir(), kubik4.getBir());
        int computer2 = mathOperation(computeDdiceNumber3, kubik3.getBir(), kubik4.getBir());

        int b = kubik1.printDice();
        int c = kubik1.printDice();
        kubik1.setBir(random());
        kubik2.setBir(random());

        int a3 = kubik1.getBir();
        int a4 = kubik2.getBir();
        kubik1.setBir(random());
        kubik2.setBir(random());

        int a5 = kubik1.getBir();
        int a6 = kubik2.getBir();
        kubik1.setBir(random());
        kubik2.setBir(random());

        int b3 = kubik3.getBir();
        int b4 = kubik4.getBir();
        kubik1.setBir(random());
        kubik2.setBir(random());

        int b5 = kubik3.getBir();
        int b6 = kubik4.getBir();

        System.out.println("-----------------------Finish Game-----------------------\n\n"
                + "  Round  |            User |         Computer\n"
                + "---------+-----------------+-----------------\n"
                + "         |  Predicted :  " + userDiceNumber + " |  Predicted :  " + computeDdiceNumber1
                + "\n -  1  - |  Dice :       " + (a1 + a2)
                + " |  Dice :       " + (b1 + b2)
                + "\n         |  Result :     " + user + " |  Result :     " + computer
                + "\n---------+-----------------+-----------------\n"
                + "         |  Predicted :  " + b + " |  Predicted :  " + computeDdiceNumber2
                + "\n -  1  - |  Dice :       " + (a3 + a4)
                + " |  Dice :       " + (b3 + b4)
                + "\n         |  Result :     " + user1 + " |  Result :     " + computer1
                + "\n---------+-----------------+-----------------\n"
                + "         |  Predicted :  " + c + " |  Predicted :  " + computeDdiceNumber3
                + "\n -  1  - |  Dice :       " + (a5 + a6)
                + " |  Dice :      " + (b5 + b6)
                + "\n         |  Result :     " + user2 + " |  Result :     " + computer2
                + "\n---------+-----------------+-----------------\n"
                + "  Total  |  Points :   " + (user1 + user2 + user) + "  |  Points :      "
                + (computer + computer1 + computer2));
        int winner3Etap = (user1 + user2 + user);
        int winner3Etap1 = (computer + computer1 + computer2);

        winner(winner3Etap, winner3Etap1);
    }
}
