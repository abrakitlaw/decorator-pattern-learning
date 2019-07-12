package com.learning.pattern.CondimentDecorator;

import com.learning.pattern.Component.Beverage;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public long cost() {
        return 4000 + beverage.cost();
    }
}
