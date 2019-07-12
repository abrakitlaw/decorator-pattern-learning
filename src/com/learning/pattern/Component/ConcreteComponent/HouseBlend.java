package com.learning.pattern.Component.ConcreteComponent;

import com.learning.pattern.Component.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public long cost() {
        return 10_000;
    }
}
