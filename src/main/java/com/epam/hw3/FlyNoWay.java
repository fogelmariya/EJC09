package com.epam.hw3;

/**
 *Class for FlyBehavior, when can't fly
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!:((((");
    }
}
