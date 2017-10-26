package com.epam.l8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String returnMonth(int number) {
        if (number >= 1 && number <= 12) {
            switch (number) {
                case 1:
                    return "January";
                case 2:
                    return "February";
                case 3:
                    return "March";
                case 4:
                    return "April";
                case 5:
                    return "May";
                case 6:
                    return "June";
                case 7:
                    return "July";
                case 8:
                    return "August";
                case 9:
                    return "September";
                case 10:
                    return "October";
                case 11:
                    return "November";
                case 12:
                    return "December";
            }
        }
        throw new IllegalArgumentException("Something is wrong " + number);
    }

    private int inputNumber() {
        int number;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            number = Integer.parseInt(reader.readLine());
            return number;
        } catch (IOException e) {
            e.printStackTrace();
        }

        throw new RuntimeException("Something is wrong");
    }

    private void outputMonth() {
        System.out.println("It is: " + returnMonth(inputNumber()));
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.outputMonth();
    }
}
