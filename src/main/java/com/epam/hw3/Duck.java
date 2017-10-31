package com.epam.hw3;

import com.epam.hw3.Interface.FlyBehavior;
import com.epam.hw3.Interface.QuackBehavior;

/**
 *
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float ");
    }

    public void setFlyBehavior(FlyBehavior realFlyBehavior) {
        flyBehavior = realFlyBehavior;
    }

    public void setQuackBehavior(QuackBehavior realQuackBehavior) {
        quackBehavior = realQuackBehavior;
    }
}
