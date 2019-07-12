package com.learning.pattern.Component.ConcreteComponent;

import com.learning.pattern.Component.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public long cost() {
        return 9_000;
    }
}
