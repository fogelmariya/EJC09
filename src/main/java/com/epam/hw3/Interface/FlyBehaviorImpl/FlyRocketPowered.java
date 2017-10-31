package com.epam.hw3.Interface.FlyBehaviorImpl;

import com.epam.hw3.Interface.FlyBehavior;

/**
 * Class for FlyBehavior, when fly with rocket
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public String fly() {
        return "I'm flying with a rocket!";
    }
}
