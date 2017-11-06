package com.epam.hw4;

/**
 * Class Horse
 */
public class Horse {
    String name;
    int speed;

    public Horse(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {

        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }
}
