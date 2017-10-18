package com.epam.hw3;

/**
 *Class for QuackBehavior, when can squeak
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("SQUEAKKKK");
    }
}
