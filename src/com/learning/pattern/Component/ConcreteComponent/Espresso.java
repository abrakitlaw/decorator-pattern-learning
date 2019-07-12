package com.learning.pattern.Component.ConcreteComponent;

import com.learning.pattern.Component.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public long cost() {
        return 7_500;
    }
}
