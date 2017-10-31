package com.epam.hw3.Interface.QuackBehaviorImpl;

import com.epam.hw3.Interface.QuackBehavior;

/**
 * Class for QuackBehavior, when can't make sound
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public String quack() {
        return "No sound";
    }
}
