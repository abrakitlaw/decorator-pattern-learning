package com.learning.pattern;

import com.learning.pattern.Component.Beverage;
import com.learning.pattern.Component.ConcreteComponent.DarkRoast;
import com.learning.pattern.Component.ConcreteComponent.Decaf;
import com.learning.pattern.Component.ConcreteComponent.Espresso;
import com.learning.pattern.Component.ConcreteComponent.HouseBlend;
import com.learning.pattern.CondimentDecorator.Milk;
import com.learning.pattern.CondimentDecorator.Mocha;
import com.learning.pattern.CondimentDecorator.Soy;
import com.learning.pattern.CondimentDecorator.Whip;

public class Main {

    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " Rp." + espresso.cost());

        Beverage decaf = new Decaf();
        decaf = new Mocha(decaf);
        decaf = new Milk(decaf);
        decaf = new Whip(decaf);
        System.out.println(decaf.getDescription() + " Rp." + decaf.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Milk(darkRoast);
        darkRoast = new Soy(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " Rp." + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Milk(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " Rp." + houseBlend.cost());
    }
}
