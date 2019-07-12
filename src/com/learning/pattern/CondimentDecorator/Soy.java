package com.learning.pattern.CondimentDecorator;

import com.learning.pattern.Component.Beverage;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public long cost() {
        return 2500 + beverage.cost();
    }
}
