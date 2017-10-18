package com.epam.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ticket {
    String classTicket;

    public static void main(String[] args) throws IOException {
        Ticket ticket = new Ticket();
        BusTicket busTicket1 = new BusTicket();
        PlaneTicket planeTicket1 = new PlaneTicket();
        TrainTicket trainTicket1 = new TrainTicket();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String param = reader.readLine();
        int value = Integer.parseInt(param);

        if (value > 1 && value < 20) {
            for (int i = 0; i < value; i++) {
                if (i == 0) {
                    System.out.println("You don't buy any ticket");
                } else {
                    System.out.println("You buy " + i + " tickets");
                }
            }
        } else {
            System.out.println("Wrong number of tickets");
        }

        System.out.println();

        switch (value % 3) {
            case 0: {
                busTicket1.setClassTicket("Extra");
                System.out.println("Your ticket's class of " + busTicket1.getTypeTicket() + ": " + busTicket1.getClassTicket());
                break;
            }
            case 1: {
                planeTicket1.setClassTicket("Business");
                System.out.println("Your ticket's class of " + planeTicket1.getTypeTicket() + ": " + planeTicket1.getClassTicket());
                break;
            }
            case 2: {
                trainTicket1.setClassTicket("Standart");
                System.out.println("Your ticket's class of " + trainTicket1.getTypeTicket() + ": " + trainTicket1.getClassTicket());
                break;
            }
        }
    }
}
