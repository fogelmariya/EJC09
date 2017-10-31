package com.epam.hw3;

import com.epam.hw3.Interface.FlyBehaviorImpl.FlyRocketPowered;

/**
 *
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck model = new ModelDuck();

        mallard.performFly();
        mallard.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
