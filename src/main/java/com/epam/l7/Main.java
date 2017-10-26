package com.epam.l7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public String getBarsik(String parameter) {
        if (isBarsik(parameter)) {
            return "Great, you have input Barsik, you did it correctly!";
        }
        throw new IllegalArgumentException("You should input Barsik, but you input: " + parameter);
    }

    private boolean isBarsik(String parameter) {
        if (parameter.equals("Barsik")) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Main main = new Main();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(main.getBarsik(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
