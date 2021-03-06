package com.epam.hw2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class for realisation of Traffic Light, where red is on for 2 minutes, yellow is on for 3 minutes, green is on for 5 minutes
 * Get time in minutes from console, return the color of traffic light now.
 */
public class TrafficLight {

    /**
     * For output color of traffic light.
     * Get time of Traffic Light's working and return the light of traffic light now
     *
     * @param activeTime - what time Traffic Light is working
     * @return String of what color is now
     */
    public static String returnLight(int activeTime) {
        int restOfTimeFromPeriod = activeTime % 10;
        if (restOfTimeFromPeriod >= 0 && restOfTimeFromPeriod < 2) {
            return " red ";
        } else if (restOfTimeFromPeriod >= 2 && restOfTimeFromPeriod < 5) {
            return " yellow ";
        } else {
            return " green ";
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input minutes of traffic light's work: ");
        String param = reader.readLine();
        int activeTime = Integer.parseInt(param);

        if (activeTime >= 0) {
            System.out.println("Now is" + returnLight(activeTime) + "light");
        } else {
            System.out.println("Wrong time");
        }
    }

}

