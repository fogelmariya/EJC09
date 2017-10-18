package com.epam.hw3;

/**
 *Class for FlyBehavior, when can fly
 */
class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
