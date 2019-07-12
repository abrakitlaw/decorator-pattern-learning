package com.learning.pattern.Component.ConcreteComponent;

import com.learning.pattern.Component.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public long cost() {
        return 12_000;
    }
}
