package com.epam.hw3;

/**
 *Example of duck, who quack and can't fly
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm model Duck!");
    }
}
