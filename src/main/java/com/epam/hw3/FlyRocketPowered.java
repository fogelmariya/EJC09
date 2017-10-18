package com.epam.hw3;

/**
 *Class for FlyBehavior, when fly with rocket
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
