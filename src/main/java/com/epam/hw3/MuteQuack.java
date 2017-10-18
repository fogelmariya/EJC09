package com.epam.hw3;

/**
 *Class for QuackBehavior, when can't make sound
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("No sound");
    }
}
