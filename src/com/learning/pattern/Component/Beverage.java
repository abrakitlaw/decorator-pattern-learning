package com.learning.pattern.Component;

public abstract class Beverage {

    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract long cost();
}
