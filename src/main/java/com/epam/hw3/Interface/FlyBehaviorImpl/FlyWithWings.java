package com.epam.hw3.Interface.FlyBehaviorImpl;

import com.epam.hw3.Interface.FlyBehavior;

/**
 *Class for FlyBehavior, when can fly
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public String fly() {
        return  "I'm flying!!";
    }
}
