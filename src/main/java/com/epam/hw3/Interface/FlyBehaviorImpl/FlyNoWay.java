package com.epam.hw3.Interface.FlyBehaviorImpl;

import com.epam.hw3.Interface.FlyBehavior;

/**
 * Class for FlyBehavior, when can't fly
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        return "I can't fly!:((((";
    }
}
