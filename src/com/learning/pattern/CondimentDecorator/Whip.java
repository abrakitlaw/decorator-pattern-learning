package com.learning.pattern.CondimentDecorator;

import com.learning.pattern.Component.Beverage;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public long cost() {
        return 3500 + beverage.cost();
    }
}
