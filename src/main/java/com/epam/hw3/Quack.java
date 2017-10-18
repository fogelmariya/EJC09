package com.epam.hw3;

/**
 *Class for QuackBehavior, when  can quack
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(" QUACKKK");
    }
}
