package com.epam.hw3;

/**
 *Example of duck, who quack and can fly
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println(" I'm a real Mallard Duck!! ");
    }
}
