package com.epam.hw3.Interface.QuackBehaviorImpl;

import com.epam.hw3.Interface.QuackBehavior;

/**
 * Class for QuackBehavior, when can squeak
 */
public class Squeak implements QuackBehavior {
    @Override
    public String quack() {
        return "SQUEAKKKK";
    }
}
