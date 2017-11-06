package com.epam.hw4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    static int balance;
    static Horse[] horse = new Horse[5];
    static int distance = 200;
    static int rate;

    private int inputnumber(BufferedReader reader) throws IOException {
        int number;
        number = (Integer.parseInt(reader.readLine()));
        return number;
    }

    public int sumOfSpeed(int startSpeed) {
        Random random = new Random();
        int result = startSpeed;
        for (int i = 0; i < (distance / 10); i++) {
            result += random.nextInt(startSpeed);
        }
        return result;
    }

    public int winner() {
        int tmpWinner = 0;
        for (int i = 1; i < 5; i++) {
            if (sumOfSpeed(horse[i].speed) > sumOfSpeed(horse[tmpWinner].speed)) {
                tmpWinner = i;
            }
        }
        return tmpWinner;
    }

    private void showMenu(BufferedReader reader) throws IOException {
        System.out.println(" 1: See information about horses" +
                "\n 2: See my balance" +
                "\n 3: Add money to balance" +
                "\n 4: Make new rate" +
                "\n 0: Leave best casino");
        switch (inputnumber(reader)) {
            case 1: {
                for (int i = 1; i < horse.length + 1; i++) {
                    System.out.println("\n Horse number: " + i + " - " + horse[i - 1].getName() + " Speed: " + horse[i - 1].getSpeed());
                }
                System.out.println("If you want to go to menu, press 1, else press 0");
                if (Integer.parseInt(reader.readLine()) == 1) {
                    showMenu(reader);
                } else {
                    break;
                }
            }
            case 2: {
                System.out.println("Your balance is: " + balance);
                System.out.println("If you want to go to menu, press 1, else press 0");
                if (Integer.parseInt(reader.readLine()) == 1) {
                    showMenu(reader);
                } else {
                    break;
                }
            }
            case 3: {
                System.out.println("Input how much money do you want to add to your balance");
                balance += inputnumber(reader);
                System.out.println("Now your balance is: " + balance);
                System.out.println("If you want to go to menu, press 1, else press 0");
                if (Integer.parseInt(reader.readLine()) == 1) {
                    showMenu(reader);
                } else {
                    break;
                }
            }
            case 4: {
                System.out.println("Enter how much money you want to bet: ");
                rate = Integer.parseInt(reader.readLine());

                System.out.println("\n Choose a number of horse you want to bet on: ");
                for (int i = 0; i < horse.length; i++) {
                    System.out.println("\n Horse number: " + i + " - " + horse[i].getName());
                }
                balance -= rate;
                if (Integer.parseInt(reader.readLine()) - 1 == winner()) {
                    balance += rate * 20 / horse[winner()].speed;
                    System.out.println("Great, you won, continue playing with us to be a millionaire!");
                } else {
                    System.out.println("Ooops, you lost, but you can bet one more time to get back your money!!");
                }
                System.out.println("if you want to go to menu, press 1, else press 0");
                if (Integer.parseInt(reader.readLine()) == 1) {
                    showMenu(reader);
                } else {
                    break;
                }
            }
            case 0: {
                System.out.println("\n Goodbye, hope you had fun and will come soon!");
                break;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        horse[0] = new Horse("Belaya", 4);
        horse[1] = new Horse("Buzefal", 9);
        horse[2] = new Horse("Pegas", 7);
        horse[3] = new Horse("Bolivar", 3);
        horse[4] = new Horse("Pedalnii", 6);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            main.showMenu(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("Wrong ");
    }

}
