package com.codi.decorator;

/**
 * Created by Codi on 2015/7/15 0015.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double coast() {
        return 0.1 + beverage.coast();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
