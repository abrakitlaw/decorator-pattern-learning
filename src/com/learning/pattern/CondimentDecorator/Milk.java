package com.learning.pattern.CondimentDecorator;

import com.learning.pattern.Component.Beverage;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public long cost() {
        return 3000 + beverage.cost();
    }
}
